package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG","onCreate has happened");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("TAG","onStart has happened");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("TAG","onResume has happened");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("TAG","onPause has happened");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("TAG","onStop has happened");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("TAG","onDestroy has happened");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("TAG","onRestart has happened");
    }

}
