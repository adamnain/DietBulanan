package com.devaon.dietbulanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JadwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        Button butHari1 = (Button) findViewById(R.id.hari_1);
        Button butHari2 = (Button) findViewById(R.id.hari_2);
        Button butHari3 = (Button) findViewById(R.id.hari_3);
        Button butHari4 = (Button) findViewById(R.id.hari_4);
        Button butHari5 = (Button) findViewById(R.id.hari_5);

        butHari1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });

        butHari2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });

        butHari3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });

        butHari4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });

        butHari5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveActivity();
            }
        });

    }

    public void moveActivity(){
        Intent i = new Intent(JadwalActivity.this, ContentProgramActivity.class);
        startActivity(i);
    }
}
