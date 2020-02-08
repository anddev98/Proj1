package com.sematec.proj1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                AlertDialog dialog = new AlertDialog.Builder(TaskProfileSec4Activity.this)
                        .setTitle("Attention")
                        .setMessage("Are you sure save?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String name = edtName.getText().toString();
                                String family = edtFamily.getText().toString();
                                String email = edtEmail.getText().toString();
                                String phone = edtPhone.getText().toString();
                                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("name",name).apply();
                                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("family",family).apply();
                                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("email",email).apply();
                                PreferenceManager.getDefaultSharedPreferences(TaskProfileSec4Activity.this).edit().putString("phone",phone).apply();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TaskProfileSec4Activity.this, "cancel save", Toast.LENGTH_SHORT).show();


                            }
                        })
                        .setNeutralButton("later", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TaskProfileSec4Activity.this, "Remind me later", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .create();
                dialog.show();
            }
        });

    }
}

