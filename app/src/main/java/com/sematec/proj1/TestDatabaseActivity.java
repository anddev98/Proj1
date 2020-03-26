package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);
        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtfamily = findViewById(R.id.edtFamily);
        final EditText edtgrade = findViewById(R.id.edtGrade);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);

        final TestDatabase db = new TestDatabase(TestDatabaseActivity.this,"Sematec",null,1);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String family = edtfamily.getText().toString();
                String grade = edtgrade.getText().toString();

                db.insertStudent(name,family,Integer.parseInt(grade));
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = db.getALLStudentsName();
                Toast.makeText(TestDatabaseActivity.this,names,Toast.LENGTH_LONG).show();
            }
        });
    }
}
