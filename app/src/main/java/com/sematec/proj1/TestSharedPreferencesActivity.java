package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);
        final TextView txtName = findViewById(R.id.txtName);
        final EditText edtName = findViewById(R.id.edtName);
        Button btnSave = findViewById(R.id.btnSave);
        String userName = PreferenceManager.getDefaultSharedPreferences(TestSharedPreferencesActivity.this).getString("name","Unkown name");
        txtName.setText(userName);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                PreferenceManager.getDefaultSharedPreferences(TestSharedPreferencesActivity.this).edit().putString("name",name).apply();
                //PreferenceManager.getDefaultSharedPreferences(TestSharedPreferencesActivity.this).edit().clear().apply();


            }
        });
    }
}
