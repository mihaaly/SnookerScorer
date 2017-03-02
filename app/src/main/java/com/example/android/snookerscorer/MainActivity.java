package com.example.android.snookerscorer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /**
     * Global variables for counting scores.
     */
    // Active player, value: 1 or 2.
    int mPlayer = 0;
    // Score counting variables.
    int mScorePlayer1 = 0;
    int mScorePlayer2 = 0;
    // Frame score counting variables.
    int mFramePlayer1 = 0;
    int mFramePlayer2 = 0;
    // Temporary variables for undo actions.
    int mTempPlayer1 = 0;
    int mTempPlayer2 = 0;
    // Variable for keeping track of ball type: 1: adds points 2: "subtracts" (foul balls)
    int mBallType = 0;
    // String variables holding players' names.
    String mNamePlayer1 = " Player 1";
    String mNamePlayer2 = " Player 2";



    /**
     * Views declared to avoid using findViewById every time.
     *
     */
    private ImageView activePlayer1;
    private ImageView activePlayer2;
    private TextView textViewScorePlayer1;
    private TextView textViewScorePlayer2;
    private TextView textViewFrameScorePlayer1;
    private TextView textViewFrameScorePlayer2;
    private EditText editTextNamePlayer1;
    private EditText editTextNamePlayer2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activePlayer1 = (ImageView) findViewById(R.id.activePlayer1);
        activePlayer2 = (ImageView) findViewById(R.id.activePlayer2);
        textViewScorePlayer1 = (TextView) findViewById(R.id.textViewScorePlayer1);
        textViewScorePlayer2 = (TextView) findViewById(R.id.textViewScorePlayer2);
        textViewFrameScorePlayer1 = (TextView) findViewById(R.id.textViewFrameScorePlayer1);
        textViewFrameScorePlayer2 = (TextView) findViewById(R.id.textViewFrameScorePlayer2);
        editTextNamePlayer1 = (EditText) findViewById(R.id.editTextNamePlayer1);
        editTextNamePlayer2 = (EditText) findViewById(R.id.editTextNamePlayer2);

        editTextNamePlayer1.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // Add your code here
                mNamePlayer1 = editTextNamePlayer1.getEditableText().toString();
            }
        });

        editTextNamePlayer2.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // Add your code here
                mNamePlayer2 = editTextNamePlayer2.getEditableText().toString();
            }
        });

    }


    /**
     * Alternates bow tie visibility and int player value (1 or 2).
     */
    public void nextPlayer(View view) {
        if (mPlayer == 1) {
            activePlayer1.setVisibility(View.INVISIBLE);
            activePlayer2.setVisibility(View.VISIBLE);
            mPlayer = 2;
            Toast.makeText(getApplicationContext(),
                    mNamePlayer2 + "'s turn",
                    Toast.LENGTH_SHORT).show();
        } else {
            activePlayer2.setVisibility(View.INVISIBLE);
            activePlayer1.setVisibility(View.VISIBLE);
            mPlayer = 1;
            Toast.makeText(getApplicationContext(),
                    mNamePlayer1 + "'s turn",
                    Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Adds 1 point to the current player and updates score counter display + textual feedback.
     */
    public void add1point(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 1;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+1 point for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 1;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+1 point for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 2 points to the current player and updates score counter display + textual feedback.
     */
    public void add2points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 2;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+2 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 2;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+2 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 3 points to the current player and updates score counter display + textual feedback.
     */
    public void add3points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 3;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+3 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 3;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+3 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 4 points to the current player and updates score counter display + textual feedback.
     */
    public void add4points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 4;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+4 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 4;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+4 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 5 points to the current player and updates score counter display + textual feedback.
     */
    public void add5points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 5;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+5 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 5;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+3 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 6 points to the current player and updates score counter display + textual feedback.
     */
    public void add6points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 6;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+6 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 6;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+6 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 7 points to the current player and updates score counter display + textual feedback.
     */
    public void add7points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 7;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+7 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 7;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+7 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 4 points to the adversary's score and updates score counter display + textual feedback.
     */
    public void subtract4points(View view) {
        mBallType = 2;
        if (mPlayer == 1 ) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 4;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+4 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 4;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+4 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 5 points to the adversary's score and updates score counter display + textual feedback.
     */
    public void subtract5points(View view) {
        mBallType = 2;
        if (mPlayer == 1 ) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 5;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+5 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 5;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+5 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 6 points to the adversary's score and updates score counter display + textual feedback.
     */
    public void subtract6points(View view) {
        mBallType = 2;
        if (mPlayer == 1 ) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 6;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+6 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 6;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+6 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Adds 7 points to the adversary's score and updates score counter display + textual feedback.
     */
    public void subtract7points(View view) {
        mBallType = 2;
        if (mPlayer == 1 ) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 7;
            displayScorePlayer2(mScorePlayer2);
            Toast.makeText(getApplicationContext(),
                    "+7 points for " + mNamePlayer2,
                    Toast.LENGTH_SHORT).show();
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 7;
            displayScorePlayer1(mScorePlayer1);
            Toast.makeText(getApplicationContext(),
                    "+7 points for " + mNamePlayer1,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Resets scores and frame scores for a new game + textual feedback.
     */
    public void newGame (View view) {
        mPlayer = 0;
        mScorePlayer1 = 0;
        mScorePlayer2 = 0;
        mFramePlayer1 = 0;
        mFramePlayer2 = 0;
        mTempPlayer1 = 0;
        mTempPlayer2 = 0;
        mBallType = 0;
        displayScorePlayer1(mScorePlayer1);
        displayScorePlayer2(mScorePlayer2);
        displayFrameScorePlayer1(mFramePlayer1);
        displayFrameScorePlayer2(mFramePlayer2);
        activePlayer1.setVisibility(View.VISIBLE);
        activePlayer2.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(),
                "New Game",
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Resets only scores and adds 1 point to the winner's frame counter + textual feedback.
     */
    public void newFrame (View view) {
        if (mScorePlayer1 < mScorePlayer2) {
            mFramePlayer2 = mFramePlayer2 + 1;
            displayFrameScorePlayer2(mFramePlayer2);
        }
        if (mScorePlayer1 > mScorePlayer2) {
            mFramePlayer1 = mFramePlayer1 +1;
            displayFrameScorePlayer1(mFramePlayer1);
        }
        mPlayer = 0;
        mScorePlayer1 = 0;
        mScorePlayer2 = 0;
        mTempPlayer1 = 0;
        mTempPlayer2 = 0;
        mBallType = 0;
        displayScorePlayer1(mScorePlayer1);
        displayScorePlayer2(mScorePlayer2);
        activePlayer1.setVisibility(View.VISIBLE);
        activePlayer2.setVisibility(View.VISIBLE);
        Toast.makeText(getApplicationContext(),
                "New Frame",
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Displays (updates) player 1's score counter.
     */
    public void displayScorePlayer1(int number) {
        textViewScorePlayer1.setText("" + number);
    }

    /**
     * Displays (updates) player 2's score counter.
     */
    public void displayScorePlayer2(int number) {
        textViewScorePlayer2.setText("" + number);
    }

    /**
     * Display (updates) player 1's frame score counter.
     */
    public void displayFrameScorePlayer1(int number) {
        textViewFrameScorePlayer1.setText("(" + number + ")");
    }

    /**
     * Display (updates) player 2's frame score counter.
     */
    public void displayFrameScorePlayer2(int number) {
        textViewFrameScorePlayer2.setText("(" + number + ")");
    }

    /**
     * Undo last score change + textual feedback.
     */
    public void undo(View view) {
        if (mPlayer == 1) {
            if (mBallType == 1){
                mScorePlayer1 = mTempPlayer1;
                displayScorePlayer1(mScorePlayer1);
            }
            if (mBallType == 2) {
                mScorePlayer2 = mTempPlayer2;
                displayScorePlayer2(mScorePlayer2);
            }
        }
        if (mPlayer == 2) {
            if (mBallType == 1) {
                mScorePlayer2 = mTempPlayer2;
                displayScorePlayer2(mScorePlayer2);
            }
            if (mBallType == 2) {
                mScorePlayer1 = mTempPlayer1;
                displayScorePlayer1(mScorePlayer1);
            }
        }
        Toast.makeText(getApplicationContext(),
                "UNDO",
                Toast.LENGTH_SHORT).show();
    }

}
