package com.snehpandya.databindingrecyclerdemo3;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.snehpandya.databindingrecyclerdemo3.databinding.ListItemBinding;

import java.util.ArrayList;

/**
 * Created by sneh.pandya on 17/07/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private ArrayList<User> list;

    public UserAdapter(ArrayList<User> list) {
        this.list = list;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View statusContainer = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new UserAdapter.ViewHolder(statusContainer);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {
        User status = list.get(position);
        holder.bindUser(status);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ListItemBinding mBinding;
        public ViewHolder (View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void bindUser(User user) {
            mBinding.setUser(user);
        }
    }
}
