package com.radhikasivarajan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        //Get the amount, convert to double, multiply with current convertion rate and display
        EditText getTheAmount = (EditText) findViewById(R.id.getAmount);
        Double dollarAmountDouble = Double.parseDouble(getTheAmount.getText().toString());
        Double poundAmount = dollarAmountDouble * 0.76;

        //Toast.makeText(this, "£" + poundAmount.toString(), Toast.LENGTH_SHORT).show();

        //With 2 decimal places
        Toast.makeText(this, "£" + String.format("%.2f",poundAmount), Toast.LENGTH_SHORT).show();

        Log.i("Test","It works");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
