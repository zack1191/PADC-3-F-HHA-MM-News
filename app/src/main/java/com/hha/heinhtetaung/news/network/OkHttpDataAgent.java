package com.hha.heinhtetaung.news.network;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.hha.heinhtetaung.news.MMNewsApp;
import com.hha.heinhtetaung.news.events.LoadedNewsEvent;
import com.hha.heinhtetaung.news.network.responses.GetNewsResponse;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by E5 on 1/6/2018.
 */

public class OkHttpDataAgent implements NewsDataAgent {
    private static OkHttpDataAgent objInstance;

    private OkHttpDataAgent() {

    }

    public static OkHttpDataAgent getObjInstance() {
        if (objInstance == null) {
            objInstance = new OkHttpDataAgent();
        }
        return objInstance;
    }

    @Override
    public void loadNews() {
        new LoadNewsTask().execute("http://padcmyanmar.com/padc-3/mm-news/apis/v1/getMMNews.php");
    }

    private static class LoadNewsTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {//String array
            String url = urls[0];

            OkHttpClient httpClient = new OkHttpClient.Builder()
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .writeTimeout(15, TimeUnit.SECONDS)
                    .readTimeout(60, TimeUnit.SECONDS)
                    .build();

            RequestBody formBody = new FormBody.Builder()
                    .add("access_token", "b002c7e1a528b7cb460933fc2875e916")
                    .add("page", "1")
                    .build();

            Request request = new Request.Builder()
                    .url(url)
                    .post(formBody)
                    .build();

            try {
                Response response = httpClient.newCall(request).execute();
                if (response.isSuccessful() && response.body() != null) {
                    String responseString = response.body().string();
                    return responseString;
                }
            } catch (IOException e) {
                Log.e(MMNewsApp.Log_TAG, e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(String response) {
            super.onPostExecute(response);
            Gson gson = new Gson();
            GetNewsResponse getNewsResponse = gson.fromJson(response, GetNewsResponse.class);
            LoadedNewsEvent event = new LoadedNewsEvent(getNewsResponse.getMmNews());
            EventBus eventBus = EventBus.getDefault();
            eventBus.post(event);
        }
    }
}
