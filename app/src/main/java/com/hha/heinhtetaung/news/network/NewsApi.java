package com.hha.heinhtetaung.news.network;

import com.hha.heinhtetaung.news.network.responses.GetNewsResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by E5 on 1/6/2018.
 */

public interface NewsApi {

    @FormUrlEncoded
    @POST("getMMNews.php")
    Call<GetNewsResponse> getNews(@Field("page") int page,
                                  @Field("access_token") String accessToken);


}
