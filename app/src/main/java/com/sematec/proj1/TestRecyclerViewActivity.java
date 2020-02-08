package com.sematec.proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TestRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler_view);
        ArrayList<PersonClass> names = new ArrayList();
        names.add(new PersonClass("Pouya","Heydari",1L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn1 ","ln1",2L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn2 ","ln2",3L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn3 ","ln3",4L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn4 ","ln4",5L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn5 ","ln5",6L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn6 ","ln6",7L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn7 ","ln7",8L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn8 ","ln8",9L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn9 ","ln9",10L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn10","ln10",11L,"09121234567",R.mipmap.ic_launcher));
        names.add(new PersonClass("fn11","ln11",12L,"09121234567",R.mipmap.ic_launcher));

        RecyclerView recycler = findViewById(R.id.recycler);
        TestAdapter adapter = new TestAdapter(names);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerViewActivity.this,RecyclerView.VERTICAL,false));

    }
}
