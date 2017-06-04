package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = (Button) findViewById(R.id.ask_button);
        final ImageView centerImage = (ImageView) findViewById(R.id.center_image);
        final int[] imageArray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5,};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magic 8" , "Ask button was clicked");

                Random generateRandomNumber = new Random();

                int randomnumber = generateRandomNumber.nextInt(5);

                centerImage.setImageResource(imageArray[randomnumber]);






            }
        });


    }
}
