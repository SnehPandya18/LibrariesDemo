package com.snehpandya.retro.interfaces;

import com.snehpandya.retro.models.PlaylistData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public interface YouTubeApi {

    @GET("playlists?part=snippet")
    Call<PlaylistData> getPlaylists(@Query("channelId") String channelId, @Query("key") String apiKey);

/*
    @GET("playlistDetails?part=snippet")
    Call<VideosData> getPlaylistItems(@Query("playlistId") String playlistId, @Query("key") String apiKey);
*/
}
