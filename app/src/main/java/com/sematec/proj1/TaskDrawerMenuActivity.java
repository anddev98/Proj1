package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class TaskDrawerMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_drawer_menu);
        Button btnShow = findViewById(R.id.btnShow);
        final DrawerLayout drawMenu = findViewById(R.id.drawMenu);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawMenu.openDrawer(GravityCompat.START);
            }
        });
    }
}
