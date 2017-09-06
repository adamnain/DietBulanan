package com.devaon.dietbulanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button buttonMenu1 = (Button) findViewById(R.id.button_menu_1);
        Button buttonMenu2 = (Button) findViewById(R.id.button_menu_2);
        Button buttonMenu3 = (Button) findViewById(R.id.button_menu_3);
        Button buttonMenu4 = (Button) findViewById(R.id.button_menu_4);

        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m1 = new Intent(MenuActivity.this, ContentMenuActivity.class);
                startActivity(m1);

                //ngirim data id ke activity ContentMenu untuk seleksi di database
            }
        });

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m2 = new Intent(MenuActivity.this, ContentMenuActivity.class);
                startActivity(m2);
            }
        });

        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(MenuActivity.this, ContentMenuActivity.class);
                startActivity(m3);
            }
        });

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m4 = new Intent(MenuActivity.this, ContentMenuActivity.class);
                startActivity(m4);
            }
        });

    }
}