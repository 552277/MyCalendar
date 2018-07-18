package com.wuji.mycalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Helloword", "onCreate。。。。。。。。。。。");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.month:
                Toast.makeText(this, "You clicked Month", Toast.LENGTH_SHORT).show();
                break;
            case R.id.week:
                Toast.makeText(this, "You clicked week", Toast.LENGTH_SHORT).show();
                break;
            case R.id.day:
                Toast.makeText(this, "You clicked day", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}