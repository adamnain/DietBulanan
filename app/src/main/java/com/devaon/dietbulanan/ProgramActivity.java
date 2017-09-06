package com.devaon.dietbulanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        Button buttonMenu1 = (Button) findViewById(R.id.button_program_1);
        Button buttonMenu2 = (Button) findViewById(R.id.button_program_2);
        Button buttonMenu3 = (Button) findViewById(R.id.button_program_3);
        Button buttonMenu4 = (Button) findViewById(R.id.button_program_4);

        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1 = new Intent(ProgramActivity.this, JadwalActivity.class);
                startActivity(p1);

                //ngirim data id ke activity ContentMenu untuk seleksi di database
            }
        });

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(ProgramActivity.this, JadwalActivity.class);
                startActivity(p2);
            }
        });

        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3 = new Intent(ProgramActivity.this, JadwalActivity.class);
                startActivity(p3);
            }
        });

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p4 = new Intent(ProgramActivity.this, JadwalActivity.class);
                startActivity(p4);
            }
        });

    }
}