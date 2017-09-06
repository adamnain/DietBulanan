package com.devaon.dietbulanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by adamnain on 9/5/2017.
 */

public class Biodata extends AppCompatActivity {
    Database myDb;
    EditText nama, tb, bb, usia;
    RadioButton laki, perempuan;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodata);
        myDb = new Database(this);

        nama = (EditText)findViewById(R.id.l_nama);
        usia = (EditText)findViewById(R.id.l_usia);
        tb = (EditText)findViewById(R.id.l_tb);
        bb = (EditText)findViewById(R.id.l_bb);
        submit = (Button) findViewById(R.id.l_submit);

        /*
        laki = (RadioButton) findViewById(laki);
        perempuan = (RadioButton) findViewById(perempuan);
        */

        inputData();


    }


    public void inputData(){
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = myDb.insertDataUser(nama.getText().toString(), usia.getText().toString(), tb.getText().toString(), bb.getText().toString(), "perempuan");
                if (isInserted = true)
                    Toast.makeText(Biodata.this, "Data Inserted "+" ",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Biodata.this, "Data not Inserted",Toast.LENGTH_LONG).show();
            }
        });
    }

}
