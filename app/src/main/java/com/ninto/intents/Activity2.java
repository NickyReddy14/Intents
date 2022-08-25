package com.ninto.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class Activity2 extends AppCompatActivity {

    private TextView t1,t2,t3;
    String n,p,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        t1= (TextView) findViewById(R.id.t1);
        t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);

        Intent i = getIntent();

        //Getting the Values from First Activity using the Intent received
        n=i.getStringExtra("name_key");
        p=i.getStringExtra("phn_key");
        c=i.getStringExtra("city_key");

        //Setting the Values to Intent
        t1.setText(n);
        t2.setText(p);
        t3.setText(c);
    }
}