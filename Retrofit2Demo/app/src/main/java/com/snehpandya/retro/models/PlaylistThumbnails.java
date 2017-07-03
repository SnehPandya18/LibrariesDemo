package com.snehpandya.retro.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class PlaylistThumbnails {
    @SerializedName("default")
    @Expose
    private ThumbDefault thumbDefault;
    @SerializedName("medium")
    @Expose
    private ThumbMedium medium;
    @SerializedName("high")
    @Expose
    private ThumbHigh high;
    @SerializedName("standard")
    @Expose
    private ThumbStandard standard;
    @SerializedName("maxres")
    @Expose
    private ThumbMaxRes maxRes;

    public ThumbDefault getThumbDefault() {
        return thumbDefault;
    }

    public ThumbMedium getMedium() {
        return medium;
    }

    public ThumbHigh getHigh() {
        return high;
    }

    public ThumbStandard getStandard() {
        return standard;
    }

    public ThumbMaxRes getMaxRes() {
        return maxRes;
    }
}
