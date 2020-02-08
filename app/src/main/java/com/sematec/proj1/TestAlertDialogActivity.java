package com.sematec.proj1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestAlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_alert_dialog);
        Button btnDialog = findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog dialog = new AlertDialog.Builder(TestAlertDialogActivity.this)
                        .setTitle("Attention")
                        .setMessage("Are youe sure?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "YES Clicked!", Toast.LENGTH_SHORT).show();


                            }

                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "No Clicked!", Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNeutralButton("Later", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(TestAlertDialogActivity.this, "Later Clicked!", Toast.LENGTH_SHORT).show();

                            }
                        }).create();
                dialog.show();

            }
        });
    }
}
