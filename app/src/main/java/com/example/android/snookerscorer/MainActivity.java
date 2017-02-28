package com.example.android.snookerscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.snookerscorer.R.id.dot;
import static com.example.android.snookerscorer.R.id.dot2;

public class MainActivity extends AppCompatActivity {

    int player= 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextPlayer (View v) {
        if (player==1) {
            dot.setVisibility(View.INVISIBLE);
        } else {
            dot2.setVisibility(View.INVISIBLE);
        }
        player = 2;


    }
}
