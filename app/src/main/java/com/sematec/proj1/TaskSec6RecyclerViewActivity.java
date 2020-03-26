package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematec.proj1.Movies.Movies;

import org.json.JSONObject;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class TaskSec6RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_sec6_recycler_view);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        String address = "https://www.omdbapi.com/?s="+title+"&apikey=27e17400";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(address,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Gson gson = new Gson();
                Movies list = gson.fromJson(response.toString(),Movies.class);
                RecyclerView rclMovie = findViewById(R.id.rclMovie);
                TaskSec6Adapter adapter = new TaskSec6Adapter(list.getSearch());
                rclMovie.setAdapter(adapter);
                rclMovie.setLayoutManager(new LinearLayoutManager(TaskSec6RecyclerViewActivity.this,RecyclerView.VERTICAL,false));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
