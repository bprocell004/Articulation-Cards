/*
Brent Procell
Articulation Applicaiton
CIS 4060: 0I
 */

package com.zybooks.articulation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    //onCreate method to bring up layout and set screen orientation to landscape
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //go to T letter cards
        ImageButton newButton = findViewById(R.id.buttonT);
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(MainActivity.this, t_cards.class);
                startActivity(registerScreen);
            }
        });

        //go to Z letter cards
        ImageButton tButton = findViewById(R.id.buttonZ);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, z_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to W letter cards
        ImageButton wButton = findViewById(R.id.buttonW);
        wButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, w_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to L letter cards
        ImageButton lButton = findViewById(R.id.buttonL);
        lButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, l_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to B letter cards
        ImageButton bButton = findViewById(R.id.buttonB);
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, b_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to R letter cards
        ImageButton rButton = findViewById(R.id.buttonR);
        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, r_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to S letter cards
        ImageButton sButton = findViewById(R.id.buttonS);
        sButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, s_cards.class);
                startActivity(registerScreen1);
            }
        });

        //go to P letter cards
        ImageButton pButton = findViewById(R.id.buttonP);
        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen1 = new Intent(MainActivity.this, p_cards.class);
                startActivity(registerScreen1);
            }
        });
    }


}
