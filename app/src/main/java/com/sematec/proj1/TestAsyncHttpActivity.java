package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematec.proj1.Pray.PrayTime;

import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class TestAsyncHttpActivity extends AppCompatActivity {

    private static final String TAG = "TestAsyncHttpActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http);
        final String address = "http://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8";
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(address,new JsonHttpResponseHandler(){
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                //Log.d(TAG,"onSuccess: " + response.toString());
                /*try {
                    JSONObject object = new JSONObject(response.toString());
                    String data = object.getString("data");
                    JSONObject object1 = new JSONObject(data);
                    String data1 = object1.getString("timings");
                    JSONObject object2 = new JSONObject(data1);
                    String asr = object2.getString("Asr");
                    Log.d(TAG, "run: " + asr);
                } catch (Exception e) {
                  e.printStackTrace();

                }*/
                Gson gson = new Gson();
                PrayTime time = gson.fromJson(response.toString(),PrayTime.class);
                Log.d(TAG,"onSuccess: "+time.getData().getTimings().getAsr());

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
