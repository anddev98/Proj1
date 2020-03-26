package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematec.proj1.Details.Detailes;
import com.squareup.picasso.Picasso;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TaskSec6DetailesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_sec6_detailes);
        Intent intent = getIntent();
        String imdbId = intent.getStringExtra("id");
        String address = "https://www.omdbapi.com/?i="+imdbId+"&apikey=27e17400";
        final TextView txtDetailTitle = findViewById(R.id.txtDetailTitle);
        final TextView txtYear = findViewById(R.id.txtYear);
        final TextView txtDirector = findViewById(R.id.txtDirector);
        final TextView txtActors = findViewById(R.id.txtActors);
        final ImageView imgPoster = findViewById(R.id.imgPoster);
        final TextView txtGenre = findViewById(R.id.txtGenre);
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(address,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Gson gson = new Gson();
                Detailes detailes = gson.fromJson(response.toString(),Detailes.class);
                txtDetailTitle.setText("Title: "+detailes.getTitle());
                txtYear.setText("Year: "+detailes.getYear());
                txtDirector.setText("Director: "+detailes.getDirector());
                txtActors.setText("Actors: "+detailes.getActors());
                txtGenre.setText("Genre: "+detailes.getGenre());

                String imageUrl = detailes.getPoster();
                Picasso.get().load(imageUrl).into(imgPoster);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
