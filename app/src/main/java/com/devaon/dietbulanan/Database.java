package com.devaon.dietbulanan;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adamnain on 9/5/2017.
 */

public class Database extends SQLiteOpenHelper {
    //tabel user untuk menyimpan data user
    public static final String nama_db = "user.db";
    public static final String tbUser = "tbuser";
    public static final String nama = "nama";
    public static final String jk = "jk";
    public static final String usia = "usia";
    public static final String tb = "tb";
    public static final String bb = "bb";
    //tabel materi tabel untuk menyimpan data materi
    public static final String tbProgram = "tbmateri";
    public static final String idMateri = "idmateri";
    public static final String judul = "judul";
    public static final String gambar = "gambar";
    public static final String konten = "konten";
    public static final String linkVideo = "linkvideo";
    //tabel bulanan untuk menyimpan materi harian
    public static final String tbHarian = "tbharian";
    public static final String idHari= "hari";
    public static final String menu1 = "menu1";
    public static final String menu2= "menu2";
    public static final String menu3= "menu3";
    public static final String ket = "ket";

    public Database(Context context){
        super(context, nama_db, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+tbUser+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAMA TEXT, JK TEXT, USIA INTEGER, TB INTEGER, BB INTEGER )");
        db.execSQL("create table "+tbHarian+" (IDHARI INTEGER , MENU1 TEXT, MENU2 TEXT, MENU3 TEXT, KET TEXT, IDPROGRAM)");
        db.execSQL("create table "+tbProgram+" (IDMATERI INTEGER PRIMARY KEY AUTOINCREMENT, JUDUL TEXT, GAMBAR TEXT, KONTEN TEXT, LINKVIDEO TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+tbUser);
        db.execSQL("drop table if exists "+tbHarian);
        db.execSQL("drop table if exists "+tbProgram);
        onCreate(db);
    }

    //BiodataActivity
    public boolean insertDataUser(String inama, String iusia, String itb, String ibb, String ijk){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(nama, inama );
        contentValues.put(jk, ijk );
        contentValues.put(usia, iusia);
        contentValues.put(tb, itb);
        contentValues.put(bb, ibb);
        long result = db.insert(tbUser, null, contentValues);
        if(result == - 1) {
            return false;
        }
        else {
            return true;
        }

    }
    public void dataContentProgram(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentProgram = new ContentValues();
        contentProgram.put(idMateri, 1);
        contentProgram.put(judul, "Diet Mayo");
        contentProgram.put(gambar, "sayuran1");
        contentProgram.put(konten, "Lorem ipsum");
        contentProgram.put(linkVideo, "http://instagram.com/himatifuinbandung");

    }
}
