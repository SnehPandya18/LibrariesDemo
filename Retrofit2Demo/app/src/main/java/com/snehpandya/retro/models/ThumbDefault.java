package com.snehpandya.retro.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class ThumbDefault {
    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl() {
        return url;
    }
}
