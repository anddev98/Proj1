package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class TaskImplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_implicit_intent);
        Button btnCall = findViewById(R.id.btnCall);
        final EditText edtPhone = findViewById(R.id.edtPhone);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                //Intent inten = new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+edtPhone.getText().toString()));
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+edtPhone.getText().toString()));
                //intent.setData(Uri.parse("tel:" + edtPhone.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
