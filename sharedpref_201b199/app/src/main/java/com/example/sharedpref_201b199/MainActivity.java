package com.example.sharedpref_201b199;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // TextView textView;
    TextView textView;
    SharedPreferences sharedPreferences;
    String pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)  findViewById(R.id.textView);


      sharedPreferences = this.getSharedPreferences("com.example.sharedpref_201b199",0);
        pref= sharedPreferences.getString("title" ,"default");
      textView.setText(pref);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.english:
                textView.setText("English");
                sharedPreferences.edit().putString("title","English");
                return true;
            case R.id.hindi:
                textView.setText("Hindi");
                sharedPreferences.edit().putString("title","Hindi");
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }


    }
}