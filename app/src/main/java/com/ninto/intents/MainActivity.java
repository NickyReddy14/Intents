package com.ninto.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText phn;
    private EditText city;
    private Button clk;

    String n,p,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clk = (Button) findViewById(R.id.clk);
        name = (EditText) findViewById(R.id.name);
        phn = (EditText) findViewById(R.id.phn);
        city = (EditText) findViewById(R.id.city);


        clk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                n=name.getText().toString();
                p=phn.getText().toString();
                c=city.getText().toString();

                Intent i = new Intent(MainActivity.this, Activity2.class);

                i.putExtra("name_key", n);
                i.putExtra("phn_key",p);
                i.putExtra("city_key", c);

                startActivity(i);
            }
        });
    }
}