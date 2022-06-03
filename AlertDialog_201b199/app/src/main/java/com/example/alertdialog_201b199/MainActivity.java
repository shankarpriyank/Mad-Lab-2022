package com.example.alertdialog_201b199;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ALert(View view) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Follow Social Distancing");
        builder1.setCancelable(true);
        builder1.setTitle("Be Alert");
        builder1.setIcon(R.drawable.ic_baseline_add_alert_24);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(),"Positive Button Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getApplicationContext(),"Negative Button Clicked",Toast.LENGTH_SHORT).show();
                    }
                });

        builder1.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getApplicationContext(), "Neutral  Button Clicked", Toast.LENGTH_SHORT).show();
            }
        }  );

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}