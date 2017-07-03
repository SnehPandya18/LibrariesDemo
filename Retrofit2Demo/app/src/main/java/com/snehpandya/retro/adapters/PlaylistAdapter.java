package com.snehpandya.retro.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.snehpandya.retro.R;
import com.snehpandya.retro.models.PlaylistItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sneh.pandya on 03/07/17.
 */

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder> {

    private final Context context;
    List<PlaylistItem> playListItems;
    public PlaylistAdapter(List<PlaylistItem> _playListItems, Context _context) {
        playListItems = _playListItems;
        context = _context;
    }

    @Override
    public PlaylistViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_item, parent, false);
        PlaylistViewHolder playlistViewHolder = new PlaylistViewHolder(view);
        return playlistViewHolder;
    }

    @Override
    public void onBindViewHolder(PlaylistViewHolder holder, int position) {
        holder.textViewPlaylist.setText(playListItems.get(position).getSnippet().getTitle());
        Picasso.with(context).load(playListItems.get(position).getSnippet().getThumbnails().getThumbDefault().getUrl()).into(holder.imageViewPlaylistItem);

        Toast.makeText(context, holder.textViewPlaylist.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return playListItems.size();
    }

    public static class PlaylistViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.cardViewPlaylist)
        CardView cardViewPlaylist;

        @BindView(R.id.imageViewPlaylistItem)
        ImageView imageViewPlaylistItem;

        @BindView(R.id.textViewPlaylist)
        TextView textViewPlaylist;

        PlaylistViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
