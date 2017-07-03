package com.snehpandya.retro.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class Snippet {
    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;
    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("thumbnails")
    @Expose
    private PlaylistThumbnails thumbnails;
    @SerializedName("channelTitle")
    @Expose
    private String channelTitle;
    @SerializedName("localized")
    @Expose
    private Localized localized;

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getChannelId() {

        return channelId;
    }

    public String getTitle() {

        return title;
    }

    public PlaylistThumbnails getThumbnails() {
        return thumbnails;
    }

    public String getChannelTitle() {
        return channelTitle;
    }
}
