package com.snehpandya.databindingrecyclerdemo4;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by Sneh on 22-07-2017.
 */

public class Article extends BaseObservable {
    private String title;
    private String excerpt;
    private boolean highlight;
    private String imageUrl;
    private int commentsNumber;
    private boolean read;

    public Article(String title, String excerpt, boolean highlight,
                   String imageUrl, int commentsNumber) {
        this.title = title;
        this.excerpt = excerpt;
        this.highlight = highlight;
        this.imageUrl = imageUrl;
        this.commentsNumber = commentsNumber;
        this.read = false;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(com.snehpandya.databindingrecyclerdemo4.BR.title);
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public void setCommentsNumber(int commentsNumber) {
        this.commentsNumber = commentsNumber;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        // change title of already read article:
        if (read && !this.read) {
            setTitle("READ: " + getTitle());
        }

        this.read = read;
    }

    public View.OnClickListener onReadMoreClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opens article detail", Toast.LENGTH_SHORT).show();
                setRead(true);
            }
        };
    }

    public View.OnClickListener onCommentsClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opens comments detail", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @BindingAdapter({"image"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).into(view);
    }
}