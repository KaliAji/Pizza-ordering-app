package com.example.pizzaorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.Callable;

public class MainActivity2 extends AppCompatActivity {

    private Button button1,button2 ;

    public static final String EXTRA_NAME ="com.example.pizzaorderapp.EXTRA_NAME";
    public static final String EXTRA_ADDRESS ="com.example.pizzaorderapp.EXTRA_ADRESS";
    public static final String EXTRA_PHONE ="com.example.pizzaorderapp.EXTRA_PHONE";
    public static final String EXTRA_EMAIL ="com.example.pizzaorderapp.EXTRA_EMAIL";
    public static final String EXTRA_SPECIAL ="com.example.pizzaorderapp.EXTRA_SPECIAL";
    public static final String EXTRA_TOTAL2 ="com.example.pizzaorderapp.EXTRA_TOTAL2";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();


        button1 = (Button) findViewById(R.id.Backb);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }
        });
        button2 = (Button) findViewById(R.id.Submitb);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFinal();
            }


        });
    }


    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openFinal() {

            EditText edittext = (EditText) findViewById(R.id.edittext);
            String name = edittext.getText().toString();

            EditText edittext1 = (EditText) findViewById(R.id.edittext1);
            String address = edittext1.getText().toString();

            EditText edittext2 = (EditText) findViewById(R.id.edittext2);
            int phone = Integer.parseInt(edittext2.getText().toString());


            EditText edittext3 = (EditText) findViewById(R.id.edittext3);
            String email = edittext3.getText().toString();

            EditText edittext4 = (EditText) findViewById(R.id.edittext4);
            String special = edittext4.getText().toString();



          Intent intent2 = new Intent(this,MainActivity3.class);
          intent2.putExtra(EXTRA_NAME,name);
          intent2.putExtra(EXTRA_ADDRESS,address);
          intent2.putExtra(EXTRA_PHONE,phone);
          intent2.putExtra(EXTRA_EMAIL,email);
          intent2.putExtra(EXTRA_SPECIAL,special);

          startActivity(intent2);

    }

}