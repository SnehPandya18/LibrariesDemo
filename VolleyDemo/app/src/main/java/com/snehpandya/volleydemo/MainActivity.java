package com.snehpandya.volleydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    RequestQueue requestQueue;
    String url = "https://docs-examples.firebaseio.com/rest/saving-data/fireblog/posts.json?print=pretty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textview);
        Button button = (Button) findViewById(R.id.button1);

        //Cache for storing response for future
        Cache cache = new DiskBasedCache(getCacheDir(), 1024*1024);

        //Network call
        Network network = new BasicNetwork(new HurlStack());

        //Request queue connected with caching and network
        requestQueue = new RequestQueue(cache, network);
        requestQueue.start();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Fetching and parsing JSON data
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("Tag", response.toString());
                                try {
                                    JSONObject one = response.getJSONObject("-JRHTHaIs-jNPLXOQivY");
                                    String author1 = one.getString("author");
                                    String title1 = one.getString("title");

                                    JSONObject two = response.getJSONObject("-JRHTHaKuITFIhnj02kE");
                                    String author2 = two.getString("author");
                                    String title2 = two.getString("title");

                                    String jsonResponse = "Author: "+author1
                                            +"\nTitle: "+title1
                                            +"\n\nAuthor: "+author2
                                            +"\nTitle: "+title2;

                                    textView.setText(jsonResponse);

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Error!", Toast.LENGTH_SHORT).show();
                    }
                });

                //Singleton instance for continuous call until the activity ends
                Singleton.getmInstance(getApplicationContext()).addToRequestQueue(jsonObjectRequest);
            }
        });
    }
}
