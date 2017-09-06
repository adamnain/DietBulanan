package com.devaon.dietbulanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContentProgramActivity extends AppCompatActivity {
    Database myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_program);
        myDb = new Database(this);
        myDb.dataContentProgram();

    }
}