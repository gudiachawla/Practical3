package com.example.myapplication;
import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = findViewById(R.id.l1);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
       // menu = menu;
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu, menu);
        return true;
    }
    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        /*MenuItem item1 = menu.findItem(R.id.Red);
        MenuItem item2 = menu.findItem(R.id.blue);
        MenuItem item3 = menu.findItem(R.id.green);*/
        switch (item.getItemId()) {
            case R.id.Red:
               /* item1.setEnabled(false);
                item2.setEnabled(true);
                item3.setEnabled(true);*/
                ll.setBackgroundColor(R.color.colorAccent);
                return true;
            case R.id.blue:
                ll.setBackgroundColor(R.color.colorPrimary);
               /* item2.setEnabled(false);
                item1.setEnabled(true);
                item3.setEnabled(true);*/
                return true;
            case R.id.green:
                ll.setBackgroundColor(R.color.colorPrimaryDark);
               /* item3.setEnabled(false);
                item2.setEnabled(true);
                item1.setEnabled(true);*/
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


}




