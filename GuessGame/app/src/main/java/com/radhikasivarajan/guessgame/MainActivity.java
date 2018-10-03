package com.radhikasivarajan.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessNumberFunction(View view){

        // Get the guess number and convert to int
        EditText getTheNumber = (EditText) findViewById(R.id.getNumber);
        int guessInt = Integer.parseInt(getTheNumber.getText().toString());

        // Check the guessed number is same as random gen number
        if (guessInt > randomNumber){
            Toast.makeText(this, "Lower! ", Toast.LENGTH_SHORT).show();
        } else if (guessInt < randomNumber){
            Toast.makeText(this, "Higher! ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Congrats! The number is " + randomNumber, Toast.LENGTH_SHORT).show();

            // If the guess is correct, gen next number
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Gen random number when app launch
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
