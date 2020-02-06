package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnsave=findViewById(R.id.btnSave);
        //Log.d("TAG","onCreate has happened");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://example.com"));
                startActivity(intent);

            }
        });
    }

    /*@Override
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
    }*/

}
