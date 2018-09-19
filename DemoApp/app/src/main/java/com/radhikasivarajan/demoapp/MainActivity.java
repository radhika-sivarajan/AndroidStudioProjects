package com.radhikasivarajan.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void buttonClick(View view){

        EditText getTheName = (EditText) findViewById(R.id.getName);
        EditText getThePassword = (EditText) findViewById(R.id.getPassword);

        Log.i("User name", getTheName.getText().toString());
        Log.i("Password", getThePassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
