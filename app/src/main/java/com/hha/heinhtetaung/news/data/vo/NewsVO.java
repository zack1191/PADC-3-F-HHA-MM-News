package com.hha.heinhtetaung.news.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by E5 on 12/17/2017.
 */

public class NewsVO {
    @SerializedName("news-id")
    private String newsId;

    private String brief;
    private String details;
    private List<String> images;

    @SerializedName("posted-date")
    private String postedDate;

    private PublicationVO publication;

    @SerializedName("favorites")
    private List<FavouriteVO> favourites;

    private List<CommentVO> comments;

    @SerializedName("sent-tos")
    private List<SentToVO> sends;

    public List<String> getImages() {
        return images;
    }

    public List<FavouriteVO> getFavourites() {
        return favourites;
    }

    public List<CommentVO> getComments() {
        return comments;
    }

    public List<SentToVO> getSends() {
        return sends;
    }

    public String getNewsId() {
        return newsId;
    }

    public String getBrief() {
        return brief;
    }

    public String getDetails() {
        return details;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public PublicationVO getPublication() {
        return publication;
    }

}
