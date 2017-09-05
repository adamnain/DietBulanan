package com.devaon.dietbulanan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseUser extends SQLiteOpenHelper {

    public static final String nama_db = "user.db";
    public static final String nama_tabel = "tbuser";
    public static final String nama = "nama";
    public static final String jk = "jk";
    public static final String usia = "usia";
    public static final String tb = "tb";
    public static final String bb = "bb";

    public DatabaseUser(Context context){
        super(context, nama_db, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+nama_tabel+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAMA STRING, JK STRING, USIA INTEGER, TB INTEGER, BB INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+nama_tabel);
        onCreate(db);
    }

}
