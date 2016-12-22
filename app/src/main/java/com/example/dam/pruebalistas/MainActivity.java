package com.example.dam.pruebalistas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnProva1 = (Button) findViewById(R.id.btnProva1);
        btnProva1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProva1.class);
                startActivity(intent);
            }
        });
        Button btnProva2 = (Button) findViewById(R.id.btnProva2);
        btnProva2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProva2.class);
                startActivity(intent);
            }
        });
        Button btnProva3 = (Button) findViewById(R.id.btnProva3);
        btnProva3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProva3.class);
                startActivity(intent);
            }
        });

        Button btnProva4 = (Button) findViewById(R.id.btnProva4);
        btnProva4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProva4.class);
                startActivity(intent);
            }
        });

        Button btnProva5 = (Button) findViewById(R.id.btnProva5);
        btnProva5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityProva5.class);
                startActivity(intent);
            }
        });
    }

}
