package com.example.kwokc2.wackmole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class endgame extends AppCompatActivity {
    private TextView finalScoreBox;
    private Button btnReplay, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endgame);

        TextView finalScoreBox = (TextView) (findViewById(R.id.finalScoreBox));
        Button btnReplay = (Button) (findViewById(R.id.btnReplay));
        Button btnExit = (Button) (findViewById(R.id.btnExit));
        int finalScore = getIntent().getIntExtra("SCORE", 0);
        finalScoreBox.setText("Congratulations! Your Final Score was: "+finalScore);

        btnReplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
}
