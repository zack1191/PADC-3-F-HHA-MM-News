package com.hha.heinhtetaung.news.network.responses;

import com.hha.heinhtetaung.news.data.vo.NewsVO;

import java.util.List;

/**
 * Created by E5 on 12/24/2017.
 */

public class GetNewsResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;
    private List<NewsVO> mmNews;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<NewsVO> getMmNews() {
        return mmNews;
    }
}
