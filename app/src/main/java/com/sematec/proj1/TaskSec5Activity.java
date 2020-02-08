package com.sematec.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskSec5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_sec5);
        ArrayList<String> items = new ArrayList();
        items.add("Phone Call");
        items.add("Add Profile");
        RecyclerView recycler = findViewById(R.id.recycler);
        TaskSec5Adapter adapter = new TaskSec5Adapter(items);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TaskSec5Activity.this,RecyclerView.VERTICAL,false));

        TextView txtName = findViewById(R.id.txtName);
        TextView txtFamily = findViewById(R.id.txtFamily);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);
        //TextView txtCall = findViewById(R.id.txtCall);
       //TextView txtProfile = findViewById(R.id.txtProfile);

        String name = PreferenceManager.getDefaultSharedPreferences(TaskSec5Activity.this).getString("name","Unknown Name");
        txtName.setText(name);
        String family = PreferenceManager.getDefaultSharedPreferences(TaskSec5Activity.this).getString("family","Unknown Family");
        txtFamily.setText(family);
        String email = PreferenceManager.getDefaultSharedPreferences(TaskSec5Activity.this).getString("email","Unknown Email");
        txtEmail.setText(email);
        String phone = PreferenceManager.getDefaultSharedPreferences(TaskSec5Activity.this).getString("phone","Unknown Phone");
        txtPhone.setText(phone);

        /*txtCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "09128953098"));
                Intent intent = new Intent(TaskSec5Activity.this,TaskImplicitIntentActivity.class);
                startActivity(intent);
            }
        });
        txtProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TaskSec5Activity.this,TaskProfileSec4Activity.class);
                startActivity(intent);
            }
        });*/
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.mai_mnu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.openDrawer:
                DrawerLayout drawerLayout = findViewById(R.id.drawerMenu);
                //drawerLayout.openDrawer(Gravity.LEFT);
                drawerLayout.openDrawer(GravityCompat.START);
                //drawMenu.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
