package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestThreadActivity extends AppCompatActivity {
    private static final  String TAG = "TestThreadActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);
        String ThreadName = Thread.currentThread().getName();
        Log.d("TAG",ThreadName);
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                String ThreadNameNew = Thread.currentThread().getName();
                Log.d("TAG",ThreadNameNew);
            }
        }));
        thread.start();
    }
}
