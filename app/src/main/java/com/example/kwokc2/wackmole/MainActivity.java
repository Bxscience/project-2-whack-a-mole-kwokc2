package com.example.kwokc2.wackmole;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button b23, b34, b45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b23 = (Button) findViewById(R.id.b23);
        b34 = (Button) findViewById(R.id.b34);
        b45 = (Button) findViewById(R.id.b45);

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start23();
            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start34();
            }
        });
        b45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start45();
            }
        });
    }

    public void start23()
    {
        Intent intent = new Intent(this, Wack23.class);
        startActivity(intent);
    }
    public void start34()
    {
        Intent intent = new Intent(this, wack34.class);
        startActivity(intent);
    }
    public void start45()
    {
        Intent intent = new Intent(this, wack45.class);
        startActivity(intent);
    }

}
