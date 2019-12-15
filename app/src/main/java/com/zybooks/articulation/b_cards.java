/*
Brent Procell
Articulation Applicaiton
CIS 4060: 0I
 */

package com.zybooks.articulation;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class b_cards extends AppCompatActivity {
    //variable declarations
    int[] images= {R.drawable.bear1, R.drawable.bird, R.drawable.broom};
    String[] text= {"Bear", "Bird", "Broom"};
    private int currentImage = 0;
    int attempts = 0;
    double check = 0.0;
    DecimalFormat df = new DecimalFormat("#%");
    //onCreate method to bring up layout and set screen orientation to landscape
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_cards);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //variable declarations for buttons and textViews of layout file
        final Button prevButton = findViewById(R.id.prevbutonT);
        final Button newButton = findViewById(R.id.nextbuttonT);
        final ImageButton checkButton = findViewById(R.id.checkbutton);
        final ImageButton xButton = findViewById(R.id.xbutton);
        final ImageView newImage = findViewById(R.id.imageView1);
        final TextView newText = findViewById(R.id.turtletext);
        final TextView attemptText = findViewById(R.id.textattempts);
        final TextView scoreText = findViewById(R.id.textscore);

        //new card button to go to the next card
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(newButton.isPressed() && images.length-1 != currentImage) {
                    currentImage++;
                    check = 0;
                    attempts = 0;
                    attemptText.setText("Attempts: " + attempts);
                    scoreText.setText("Score: " + df.format(check));
                    newImage.setImageResource(images[currentImage]);
                    newText.setText(text[currentImage]);
                }
            }
        });

        //prev card button to go back to the previous card
        prevButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(prevButton.isPressed() && currentImage > 0) {
                    currentImage--;
                    check = 0;
                    attempts = 0;
                    attemptText.setText("Attempts: " + attempts);
                    scoreText.setText("Score: " + df.format(check));
                    newImage.setImageResource(images[currentImage]);
                    newText.setText(text[currentImage]);
                }
            }
        });

        //done button back to homepage
        Button doneButton = findViewById(R.id.donebutton);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check = 0;
                attempts = 0;
                attemptText.setText("Attempts: " + attempts);
                scoreText.setText("Score: " + df.format(check));
                Intent registerScreen = new Intent(b_cards.this, MainActivity.class);
                startActivity(registerScreen);
            }
        });

        //check button to mark right response
        checkButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(checkButton.isPressed()) {
                    attempts++;
                    check++;
                    attemptText.setText("Attempts: " + attempts);
                    scoreText.setText("Score: " + df.format(check/attempts));
                }
            }
        });

        //x button to mark wrong response
        xButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(xButton.isPressed()) {
                    attempts++;
                    attemptText.setText("Attempts: " + attempts);
                    scoreText.setText("Score: " + df.format(check/attempts));
                }
            }
        });
    }
}

