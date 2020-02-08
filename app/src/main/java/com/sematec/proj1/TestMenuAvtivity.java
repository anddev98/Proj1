package com.sematec.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TestMenuAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu_avtivity);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.mai_mnu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.firstItem:
                Toast.makeText(TestMenuAvtivity.this,"First Item Clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.secondItem:
                Toast.makeText(TestMenuAvtivity.this,"Second Item Clicked!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.thirdItem:
                Toast.makeText(TestMenuAvtivity.this,"Third Item Clicked!",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
