package com.snehpandya.databindingrecyclerdemo4;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.snehpandya.databindingrecyclerdemo4.databinding.ArticleItemBinding;

import java.util.List;

/**
 * Created by Sneh on 23-07-2017.
 */

class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.BindingHolder> {

    private List<Article> mArticles;

    ArticleAdapter(List<Article> mArticles) {
        this.mArticles = mArticles;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ArticleItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.article_item, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ArticleItemBinding binding = holder.binding;
        binding.setArticle(mArticles.get(position));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    static class BindingHolder extends RecyclerView.ViewHolder {
        private ArticleItemBinding binding;

        BindingHolder(ArticleItemBinding binding) {
            super(binding.contactCard);
            this.binding = binding;
        }
    }
}