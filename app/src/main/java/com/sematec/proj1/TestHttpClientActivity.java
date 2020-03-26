package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHttpClientActivity extends AppCompatActivity {
    private  static  final  String TAG = "TestHttpClientActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_http_client);
        final String address = "http://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8";
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //URL obj = new URL("https://google.com");
                    //URL obj = new URL(" http://api.aladhan.com/v1/timingsByCity?city=Dubai&country=United%20Arab%20Emirates&method=8");
                    URL obj = new URL(address);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");
                    int responseCode = con.getResponseCode();
                    if (responseCode == HttpURLConnection.HTTP_OK) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                        String inputLine;
                        StringBuffer response = new StringBuffer();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                            JSONObject object = new JSONObject(response.toString());
                            String data = object.getString("data");
                            JSONObject object1 = new JSONObject(data);
                            String data1 = object1.getString("timings");
                            JSONObject object2 = new JSONObject(data1);
                            String asr = object2.getString("Asr");
                            Log.d(TAG,"run: "+ asr);
                        }
                        //System.out.println(response.toString());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();

    }
}
