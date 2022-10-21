package com.example.pizzaorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TOTAL ="com.example.pizzaorderapp.EXTRA_TOTAL";

    Pmodel pmodel;
    TextView Total;
    double Dynprice;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pmodel = new Pmodel();
        Total = findViewById(R.id.Total);

        button = (Button) findViewById(R.id.NextB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoForm();
            }


        });
    }
    public void openInfoForm() {
        Intent intent = new Intent(this, MainActivity2.class);

        startActivity(intent);
    }
    public void radioClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rb_1:
                if (checked)
                    pmodel.setSize_price(6);
                break;
            case R.id.rb_2:
                if (checked)
                    pmodel.setSize_price(8);
                break;
            case R.id.rb_3:
                if (checked)
                    pmodel.setSize_price(10);
                break;
            case R.id.rb_4:
                if (checked)
                    pmodel.setSize_price(12);
                break;
        }
        Total.setText("Total Price: $" + String.format("%.2f", total_calc()));
        //GloTotal = total_calc();

    }

    public void onCheckBoxClick(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.mushroom_cb:
                if (checked)
                    pmodel.setMushroom_price(5);
                else
                    pmodel.setMushroom_price(0);
                break;
            case R.id.shrimp_cb:
                if (checked)
                    pmodel.setShrimp_price(10);
                else
                    pmodel.setShrimp_price(0);
                break;
            case R.id.steak_cb:
                if (checked)
                    pmodel.setSteak_price(8);
                else
                    pmodel.setSteak_price(0);
                break;
            case R.id.chicken_cb:
                if (checked)
                    pmodel.setChicken_price(7);
                else
                    pmodel.setChicken_price(0);
                break;
            case R.id.GB_cb:
                if (checked)
                    pmodel.setGroundbeef_price(8);
                else
                    pmodel.setGroundbeef_price(0);
                break;
            case R.id.pinapple_cb:
                if (checked)
                    pmodel.setPinapple_price(5);
                else
                    pmodel.setPinapple_price(0);
                break;
            case R.id.tuna_cb:
                if (checked)
                    pmodel.setTuna_price(5);
                else
                    pmodel.setTuna_price(0);
                break;
        }
        Total.setText("Total Price: $" + String.format("%.2f", total_calc()));
       // GloTotal = total_calc();
    }

    public void onSwitchClick(View view) {
        boolean checked = ((Switch) view).isChecked();
        switch (view.getId()) {
            case R.id.Extra_cheese:
                if (checked)
                    pmodel.setCheese_price(5);
                else
                    pmodel.setCheese_price(0);
                break;
            case R.id.delivery:
                if (checked)
                    pmodel.setDelivery_fee(3);
                else
                    pmodel.setDelivery_fee(0);
                break;


        }

        Total.setText("Total Price: $" + String.format("%.2f", total_calc()));
       // GloTotal = total_calc();
    }

    private double total_calc (){
        Dynprice = pmodel.getSize_price()+pmodel.getMushroom_price()+pmodel.getShrimp_price()+pmodel.getSteak_price()+pmodel.getChicken_price()
                +pmodel.getGroundbeef_price()+ pmodel.getPinapple_price()+pmodel.getTuna_price()+pmodel.getCheese_price()+pmodel.getDelivery_fee();

        return Dynprice;
    }


}