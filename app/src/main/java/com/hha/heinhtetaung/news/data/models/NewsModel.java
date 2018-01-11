package com.hha.heinhtetaung.news.data.models;

import com.hha.heinhtetaung.news.network.HttpUrlConnectionDataAgent;
import com.hha.heinhtetaung.news.network.NewsDataAgent;
import com.hha.heinhtetaung.news.network.OkHttpDataAgent;
import com.hha.heinhtetaung.news.network.RetrofitDataAgent;

import okhttp3.OkHttpClient;

/**
 * Created by E5 on 12/23/2017.
 */

public class NewsModel {
    private static NewsModel sObjInstance;
    private NewsDataAgent mDataAgent;

    private NewsModel() {

        //mDataAgent = HttpUrlConnectionDataAgent.getObjInstance();
        //mDataAgent = OkHttpDataAgent.getObjInstance();
        mDataAgent = RetrofitDataAgent.getsObjInstance();
    }

    public static NewsModel getsObjInstance() {
        if (sObjInstance == null) {
            sObjInstance = new NewsModel();
        }
        return sObjInstance;
    }


    /**
     * load data from network layer
     */
    public void loadNews() {
        mDataAgent.loadNews();
    }
}
