package com.hha.heinhtetaung.news.data.models;

import com.hha.heinhtetaung.news.network.HttpUrlConnectionDataAgent;
import com.hha.heinhtetaung.news.network.NewsDataAgent;

/**
 * Created by E5 on 12/23/2017.
 */

public class NewsModel {
    private static NewsModel sObjInstance;
    private NewsDataAgent mDataAgent;

    private NewsModel() {
        mDataAgent = HttpUrlConnectionDataAgent.getObjInstance();
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
