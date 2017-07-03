package com.snehpandya.retro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snehpandya.retro.adapters.PlaylistAdapter;
import com.snehpandya.retro.interfaces.YouTubeApi;
import com.snehpandya.retro.models.PlaylistData;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

//CodeEasy

import static retrofit2.converter.gson.GsonConverterFactory.create;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listViewPlayList)
    RecyclerView listViewPlayList;
    private YouTubeApi youTubeApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder().baseUrl(getString(R.string.api_url)).addConverterFactory(create(gson)).build();

        youTubeApi = retrofit.create(YouTubeApi.class);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL);
        listViewPlayList.setLayoutManager(staggeredGridLayoutManager);

        Call<PlaylistData> playlistDataCall = youTubeApi.getPlaylists(getString(R.string.channel_id), getString(R.string.api_key));
        playlistDataCall.enqueue(new Callback<PlaylistData>() {
            @Override
            public void onResponse(Call<PlaylistData> call, Response<PlaylistData> response) {
                int statusCode = response.code();

                PlaylistData playlistData = response.body();
                Log.d("PlaylistsData", "Response:" + statusCode);

                PlaylistAdapter adapter = new PlaylistAdapter(playlistData.getItems(), getApplicationContext());
                listViewPlayList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PlaylistData> call, Throwable t) {
                Log.d("PlaylistsData", "onFailure: " + t.getMessage());
            }
        });
    }
}
