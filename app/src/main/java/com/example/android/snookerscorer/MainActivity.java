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
        ImageView activePlayer1 = (ImageView) findViewById(R.id.activePlayer1);
        ImageView activePlayer2 = (ImageView) findViewById(R.id.activePlayer2);
        if (player == 1) {
            activePlayer1.setVisibility(View.INVISIBLE);
            activePlayer2.setVisibility(View.VISIBLE);
            player = 2;
        } else {
            activePlayer2.setVisibility(View.INVISIBLE);
            activePlayer1.setVisibility(View.VISIBLE);
            player = 1;
        }

    }


}

