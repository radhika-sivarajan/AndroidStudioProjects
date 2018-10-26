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

    // Methos to display toast
    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessNumberFunction(View view){

        // Get the guessed number and convert to int
        EditText getTheNumber = (EditText) findViewById(R.id.getNumber);
        int guessInt = Integer.parseInt(getTheNumber.getText().toString());

        // Check the guessed number is same as the random gen number
        if (guessInt > randomNumber){
            makeToast("Lower!");
        } else if (guessInt < randomNumber){
            makeToast("Higher!");
        } else {
            makeToast("Congrats! The number is " + randomNumber);

            // If the guess is correct, generate next number
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get random number when the app is launched
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
