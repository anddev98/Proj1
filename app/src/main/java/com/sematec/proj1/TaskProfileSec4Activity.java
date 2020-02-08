package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TaskProfileSec4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_profile_sec4);
        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        final EditText edtEmail = findViewById(R.id.edtEmail);
        final EditText edtPhone = findViewById(R.id.edtPhone);
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String family = edtFamily.getText().toString();
                String email = edtEmail.getText().toString();
                String phone = edtPhone.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("name",name).apply();
                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("family",family).apply();
                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("email",email).apply();
                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("phone",phone).apply();
         }
        });
    }
}
