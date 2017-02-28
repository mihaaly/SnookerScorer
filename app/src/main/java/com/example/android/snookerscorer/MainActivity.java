package com.example.android.snookerscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    int player = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextPlayer(View v) {
        ImageView dot = (ImageView) findViewById(R.id.dot);
        ImageView dot2 = (ImageView) findViewById(R.id.dot2);
        if (player == 1) {
            dot.setVisibility(View.INVISIBLE);
            dot2.setVisibility(View.VISIBLE);
            player = 2;
        } else {
            dot2.setVisibility(View.INVISIBLE);
            dot.setVisibility(View.VISIBLE);
            player = 1;
        }
        
    }


}

