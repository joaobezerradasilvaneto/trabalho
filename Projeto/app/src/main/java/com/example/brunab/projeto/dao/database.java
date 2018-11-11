package com.example.brunab.projeto.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class database extends SQLiteOpenHelper{


    public database(Context context){
        super(context,"BancoDB",null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql= "CREATE TABLE IF NOT EXISTS CLIENTES(" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                "NOME VARCHAR(30)," +
                "CPF VARCHAR(11)," +
                "ENDERECO VARCHAR(50),"+
                "DEPENDENTES INTEGER,"+
                "CNH VARCHAR(13));";

        sqLiteDatabase.execSQL(sql);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
