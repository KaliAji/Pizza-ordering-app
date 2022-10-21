package com.example.pizzaorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity2.EXTRA_NAME);
        String address = intent.getStringExtra(MainActivity2.EXTRA_ADDRESS);
        int phone = intent.getIntExtra(MainActivity2.EXTRA_PHONE, 0 );
        String email = intent.getStringExtra(MainActivity2.EXTRA_EMAIL);
        String special = intent.getStringExtra(MainActivity2.EXTRA_SPECIAL);
       // double total = intent.getDoubleExtra(MainActivity.EXTRA_TOTAL,0);


        TextView textView4 = (TextView) findViewById(R.id.textView4);
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
       // TextView textView9 = (TextView) findViewById(R.id.textView9);

        textView4.setText(name);
        textView5.setText(address);
        textView6.setText(""+phone);
        textView7.setText(email);
        textView8.setText(special);
        //textView9.setText(""+total);

    }
}