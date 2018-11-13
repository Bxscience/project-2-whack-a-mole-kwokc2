package com.example.kwokc2.wackmole;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class wack45 extends AppCompatActivity {

    private ImageButton mole1, mole2, mole3, mole4, mole5, mole6, mole7, mole8, mole9, mole10, mole11, mole12, mole13, mole14, mole15, mole16, mole17, mole18, mole19, mole20;
    private TextView scorebox, timebox;
    private int score;
    private CountDownTimer cdt;
    private ArrayList<ImageButton> btnArray;
    private Random rdm;
    private int rdmMole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wack45);
        score = 0;
        btnArray = new ArrayList<>();
        setup();
        rdm = new Random();
        rdmMole = 0;
        cdt = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timebox.setText("Time: " + millisUntilFinished / 1000);
                btnArray.get(rdmMole).setVisibility(View.INVISIBLE);
                rdmMole = rdm.nextInt(6);
                btnArray.get(rdmMole).setVisibility(View.VISIBLE);
            }

            @Override
            public void onFinish() {
                btnArray.get(rdmMole).setVisibility(View.INVISIBLE);
                timebox.setText("Time: 0");
                end();
            }
        }.start();
    }
    private void setup()
    {
        mole1 = (ImageButton) findViewById(R.id.mole1);
        mole2 = (ImageButton) findViewById(R.id.mole2);
        mole3 = (ImageButton) findViewById(R.id.mole3);
        mole4 = (ImageButton) findViewById(R.id.mole4);
        mole5 = (ImageButton) findViewById(R.id.mole5);
        mole6 = (ImageButton) findViewById(R.id.mole6);
        mole7 = (ImageButton) findViewById(R.id.mole7);
        mole8 = (ImageButton) findViewById(R.id.mole8);
        mole9 = (ImageButton) findViewById(R.id.mole9);
        mole10 = (ImageButton) findViewById(R.id.mole10);
        mole11 = (ImageButton) findViewById(R.id.mole11);
        mole12 = (ImageButton) findViewById(R.id.mole12);
        mole13 = (ImageButton) findViewById(R.id.mole13);
        mole14 = (ImageButton) findViewById(R.id.mole14);
        mole15 = (ImageButton) findViewById(R.id.mole15);
        mole16 = (ImageButton) findViewById(R.id.mole16);
        mole17 = (ImageButton) findViewById(R.id.mole17);
        mole18 = (ImageButton) findViewById(R.id.mole18);
        mole19 = (ImageButton) findViewById(R.id.mole19);
        mole20 = (ImageButton) findViewById(R.id.mole20);
        timebox = (TextView) findViewById(R.id.timebox);
        scorebox = (TextView) findViewById(R.id.scorebox);
        btnArray.add(mole1);
        btnArray.add(mole2);
        btnArray.add(mole3);
        btnArray.add(mole4);
        btnArray.add(mole5);
        btnArray.add(mole6);
        btnArray.add(mole7);
        btnArray.add(mole8);
        btnArray.add(mole9);
        btnArray.add(mole10);
        btnArray.add(mole11);
        btnArray.add(mole12);
        btnArray.add(mole13);
        btnArray.add(mole14);
        btnArray.add(mole15);
        btnArray.add(mole16);
        btnArray.add(mole17);
        btnArray.add(mole18);
        btnArray.add(mole19);
        btnArray.add(mole20);
        for (ImageButton btn : btnArray) {
            btn.setOnClickListener(buttonListener);
        }
    }
    private final View.OnClickListener buttonListener = new View.OnClickListener() {

        public void onClick(View v) {
            score += 1;
            scorebox.setText("Score: "+String.valueOf(score));
            btnArray.get(rdmMole).setVisibility(View.INVISIBLE);
        }
    };

    public void end()
    {
        Intent intent = new Intent(getApplicationContext(), endgame.class);
        intent.putExtra("SCORE", score);
        startActivity(intent);
    }
}

