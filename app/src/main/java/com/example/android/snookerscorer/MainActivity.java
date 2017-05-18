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

        // Views declared to avoid using findViewById every time.
        activePlayer1 = (ImageView) findViewById(R.id.activePlayer1);
        activePlayer2 = (ImageView) findViewById(R.id.activePlayer2);
        textViewScorePlayer1 = (TextView) findViewById(R.id.textViewScorePlayer1);
        textViewScorePlayer2 = (TextView) findViewById(R.id.textViewScorePlayer2);
        textViewFrameScorePlayer1 = (TextView) findViewById(R.id.textViewFrameScorePlayer1);
        textViewFrameScorePlayer2 = (TextView) findViewById(R.id.textViewFrameScorePlayer2);
        editTextNamePlayer1 = (EditText) findViewById(R.id.editTextNamePlayer1);
        editTextNamePlayer2 = (EditText) findViewById(R.id.editTextNamePlayer2);

        // Gets name of player 1 when the name is edited.
        editTextNamePlayer1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                mNamePlayer1 = editTextNamePlayer1.getEditableText().toString();
            }
        });

        // Gets name of player 2 when the name is edited.
        editTextNamePlayer2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable s) {
                mNamePlayer2 = editTextNamePlayer2.getEditableText().toString();
            }
        });
    }

    /**
     * Alternates bow tie visibility and int player value (1 or 2) keeping track of player turns.
     */
    public void nextPlayer(View view) {
        if (mPlayer == 1) {
            activePlayer1.setVisibility(View.INVISIBLE);
            activePlayer2.setVisibility(View.VISIBLE);
            mPlayer = 2;
            showToast(mNamePlayer2 + (this.getString(R.string.stringTurn)));
        } else {
            activePlayer2.setVisibility(View.INVISIBLE);
            activePlayer1.setVisibility(View.VISIBLE);
            mPlayer = 1;
            showToast(mNamePlayer1 + (this.getString(R.string.stringTurn)));
        }
    }

    /**
     * Adds 1 point to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add1point(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 1;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus1) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 1;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus1) + mNamePlayer2);
        }
    }

    /**
     * Adds 2 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add2points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 2;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus2) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 2;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus2) + mNamePlayer2);
        }
    }

    /**
     * Adds 3 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add3points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 3;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus3) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 3;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus3) + mNamePlayer2);
        }
    }

    /**
     * Adds 4 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add4points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 4;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus4) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 4;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus4) + mNamePlayer2);
        }
    }

    /**
     * Adds 5 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add5points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 5;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus5) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 5;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus5) + mNamePlayer2);
        }
    }

    /**
     * Adds 6 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add6points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 6;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus6) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 6;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus6) + mNamePlayer2);
        }
    }

    /**
     * Adds 7 points to the score of current player, updates score counter display and
     * displays a toast message.
     */
    public void add7points(View view) {
        mBallType = 1;
        if (mPlayer == 1) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 7;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus7) + mNamePlayer1);
        }
        if (mPlayer == 2) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 7;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus7) + mNamePlayer2);
        }
    }

    /**
     * Adds 4 points to the opponent's score, updates score counter display and
     * displays a toast message.
     */
    public void subtract4points(View view) {
        mBallType = 2;
        if (mPlayer == 1) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 4;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus4) + mNamePlayer2);
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 4;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus4) + mNamePlayer1);
        }
    }

    /**
     * Adds 5 points to the opponent's score, updates score counter display and
     * displays a toast message.
     */
    public void subtract5points(View view) {
        mBallType = 2;
        if (mPlayer == 1) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 5;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus5) + mNamePlayer2);
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 5;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus5) + mNamePlayer1);
        }
    }

    /**
     * Adds 6 points to the opponent's score, updates score counter display and
     * displays a toast message.
     */
    public void subtract6points(View view) {
        mBallType = 2;
        if (mPlayer == 1) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 6;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus6) + mNamePlayer2);
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 6;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus6) + mNamePlayer1);
        }
    }

    /**
     * Adds 7 points to the opponent's score, updates score counter display and
     * displays a toast message.
     */
    public void subtract7points(View view) {
        mBallType = 2;
        if (mPlayer == 1) {
            mTempPlayer2 = mScorePlayer2;
            mScorePlayer2 = mScorePlayer2 + 7;
            displayScorePlayer2(mScorePlayer2);
            showToast(this.getString(R.string.stringPlus7) + mNamePlayer2);
        }
        if (mPlayer == 2) {
            mTempPlayer1 = mScorePlayer1;
            mScorePlayer1 = mScorePlayer1 + 7;
            displayScorePlayer1(mScorePlayer1);
            showToast(this.getString(R.string.stringPlus7) + mNamePlayer1);
        }
    }

    /**
     * Resets scores, frame scores for a new game and displays a toast message.
     */
    public void newGame(View view) {
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
        showToast(this.getString(R.string.stringNewGame));
    }

    /**
     * Resets only scores and adds 1 point to the winner's frame counter and displays
     * a toast message.
     */
    public void newFrame(View view) {
        if (mScorePlayer1 < mScorePlayer2) {
            mFramePlayer2 = mFramePlayer2 + 1;
            displayFrameScorePlayer2(mFramePlayer2);
        }
        if (mScorePlayer1 > mScorePlayer2) {
            mFramePlayer1 = mFramePlayer1 + 1;
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
        showToast(this.getString(R.string.stringNewFrame));
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
     * Undo last score change and displays a toast message.
     */
    public void undo(View view) {
        if (mPlayer == 1) {
            if (mBallType == 1) {
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
        showToast(this.getString(R.string.stringUndo));
    }

    /**
     * Displays Toast message.
     */
    public void showToast(String strMessage) {
        Toast.makeText(getApplicationContext(),
                strMessage,
                Toast.LENGTH_SHORT).show();
    }
}
