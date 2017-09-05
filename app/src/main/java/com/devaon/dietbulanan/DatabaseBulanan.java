package com.devaon.dietbulanan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseBulanan extends SQLiteOpenHelper {
    public static final String nama_db = "bulanan.db";
    public static final String nama_tabel = "tbbulanan";
    public static final String hari= "hari";
    public static final String menu1 = "menu1";
    public static final String menu2= "menu2";
    public static final String menu3= "menu3";
    public static final String menu4= "menu4";
    public static final String menu5= "menu5";
    public static final String menu6= "menu6";
    public static final String menu7= "menu7";
    public static final String menu8= "menu8";
    public static final String menu9= "menu9";
    public static final String menu10= "menu10";
    public static final String menu11= "menu11";
    public static final String menu12= "menu12";
    public static final String menu13= "menu13";
    public static final String menu14= "menu14";
    public static final String menu15= "menu15";
    public static final String menu16= "menu16";
    public static final String menu17= "menu17";
    public static final String menu18= "menu18";
    public static final String menu19= "menu19";
    public static final String menu20= "menu20";
    public static final String menu21= "menu21";
    public static final String menu22= "menu22";
    public static final String menu23= "menu23";
    public static final String menu24= "menu24";
    public static final String menu25= "menu25";
    public static final String menu26= "menu26";
    public static final String menu27= "menu27";
    public static final String menu28= "menu28";
    public static final String menu29= "menu29";
    public static final String menu30= "menu30";
    public static final String ket= "ket";


    public DatabaseBulanan(Context context){
        super(context, nama_db, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+nama_tabel+" (HARI INTEGER PRIMARY KEY, MENU1 TEXT, MENU2 TEXT, MENU3 TEXT, MENU4 TEXT, MENU5 TEXT, MENU6 TEXT, MENU7 TEXT, MENU8 TEXT, MENU9 TEXT, MENU10 TEXT, MENU11 TEXT, MENU12 TEXT, MENU13 TEXT, MENU14 TEXT, MENU15 TEXT, MENU16 TEXT, MENU17 TEXT, MENU18 TEXT, MENU19 TEXT, MENU20 TEXT, MENU21 TEXT, MENU22 TEXT, MUNU23 TEXT, MENU24 TEXT, MENU25 TEXT, MENU26 TEXT, MENU27 TEXT, MENU28 TEXT, MENU29 TEXT, MENU30 TEXT, KET STRING )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists "+nama_tabel);
        onCreate(db);
    }
}
