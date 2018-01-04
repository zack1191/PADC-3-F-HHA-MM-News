package com.hha.heinhtetaung.news.events;

import com.hha.heinhtetaung.news.data.vo.NewsVO;

import java.util.List;

/**
 * Created by E5 on 12/24/2017.
 */

public class LoadedNewsEvent {

    private List<NewsVO> newsList;

    public LoadedNewsEvent(List<NewsVO> newsList) {
        this.newsList = newsList;
    }

    public List<NewsVO> getNewsList() {
        return newsList;
    }
}
