package com.radhikasivarajan.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void newCat(View view){

//        Button lick image change (Get image id change resource)
        ImageView getCatImage = (ImageView) findViewById(R.id.catImageView);
        getCatImage.setImageResource(R.drawable.cat2);

        Log.i("Test","It works....");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
