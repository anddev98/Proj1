package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TaskSec6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_sec6);
        final EditText edtTitle = findViewById(R.id.edtTitle);
        Button btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edtTitle.getText().toString();
                Intent intent = new Intent(TaskSec6Activity.this,TaskSec6RecyclerViewActivity.class);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

    }
}
