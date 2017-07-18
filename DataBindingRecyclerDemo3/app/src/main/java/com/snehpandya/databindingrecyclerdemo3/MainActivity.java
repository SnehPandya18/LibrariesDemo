package com.snehpandya.databindingrecyclerdemo3;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.snehpandya.databindingrecyclerdemo3.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private ArrayList<User> mUsers = new ArrayList<>();
    private UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        fillData();
        mAdapter = new UserAdapter(mUsers);
        mBinding.recycler.setAdapter(mAdapter);
    }

    private void fillData() {
        mUsers.add(new User("Google Developers Group", "https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png", 10));
        mUsers.add(new User("Google", "https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg", 26));
        mUsers.add(new User("Udacity", "https://pbs.twimg.com/profile_images/703090165976162305/XU5nh5a9_400x400.jpg", 5));
        mUsers.add(new User("Twitter", "https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg", 11));
        mUsers.add(new User("Microsoft", "https://pbs.twimg.com/profile_images/875416480547917824/R6wl9gWl_400x400.jpg", 42));
        mUsers.add(new User("Google Developers Group", "https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png", 10));
        mUsers.add(new User("Google", "https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg", 26));
        mUsers.add(new User("Udacity", "https://pbs.twimg.com/profile_images/703090165976162305/XU5nh5a9_400x400.jpg", 5));
        mUsers.add(new User("Twitter", "https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg", 11));
        mUsers.add(new User("Microsoft", "https://pbs.twimg.com/profile_images/875416480547917824/R6wl9gWl_400x400.jpg", 42));
        mUsers.add(new User("Google Developers Group", "https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png", 10));
        mUsers.add(new User("Google", "https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg", 26));
        mUsers.add(new User("Udacity", "https://pbs.twimg.com/profile_images/703090165976162305/XU5nh5a9_400x400.jpg", 5));
        mUsers.add(new User("Twitter", "https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg", 11));
        mUsers.add(new User("Microsoft", "https://pbs.twimg.com/profile_images/875416480547917824/R6wl9gWl_400x400.jpg", 42));
        mUsers.add(new User("Google Developers Group", "https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png", 10));
        mUsers.add(new User("Google", "https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg", 26));
        mUsers.add(new User("Udacity", "https://pbs.twimg.com/profile_images/703090165976162305/XU5nh5a9_400x400.jpg", 5));
        mUsers.add(new User("Twitter", "https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg", 11));
        mUsers.add(new User("Microsoft", "https://pbs.twimg.com/profile_images/875416480547917824/R6wl9gWl_400x400.jpg", 42));
        mUsers.add(new User("Google Developers Group", "https://pbs.twimg.com/profile_images/2652314177/3c0f918ced0ad55d8a628c1df7739b62_400x400.png", 10));
        mUsers.add(new User("Google", "https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg", 26));
        mUsers.add(new User("Udacity", "https://pbs.twimg.com/profile_images/703090165976162305/XU5nh5a9_400x400.jpg", 5));
        mUsers.add(new User("Twitter", "https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg", 11));
        mUsers.add(new User("Microsoft", "https://pbs.twimg.com/profile_images/875416480547917824/R6wl9gWl_400x400.jpg", 42));
    }

    @BindingAdapter({"android:src"})
    public static void setImage(ImageView image, String url) {
        if (url != null && url.trim().length() > 0) {
            Picasso.with(image.getContext()).load(url).error(R.mipmap.ic_launcher).into(image);
        } else {
            image.setImageResource(R.mipmap.ic_launcher);
        }
    }
}
