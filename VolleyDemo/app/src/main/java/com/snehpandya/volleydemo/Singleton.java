package com.snehpandya.volleydemo;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Sneh on 04-06-2017.
 */

public class Singleton {

    private static Singleton mInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;

    private Singleton(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }


    public RequestQueue getRequestQueue() {
        if(mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }

    public static synchronized Singleton getmInstance(Context context) {
        if (mInstance == null) {
            mInstance = new Singleton(context);
        }
        return mInstance;
    }

    public<T> void addToRequestQueue(Request<T> request) {
        mRequestQueue.add(request);
    }
}
