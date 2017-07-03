package com.snehpandya.retro.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class PlaylistData {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("PageInfo")
    @Expose
    private PlaylistPageInfo pageinfo;
    @SerializedName("items")
    @Expose
    private List<PlaylistItem> items;

    public List<PlaylistItem> getItems() {
        return items;
    }
}
