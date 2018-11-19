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

        StringBuilder sb = new StringBuilder();

//--Alteração do sql para INTEGER, NOT NULL, PRIMARY KEY AUTOINCREMENT
         sb.append(
                 CREATE TABLE 'Carro' (
                'IDCARRO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                'NOME' VARCHAR(40) NULL,
                'MARCA' VARCHAR(40) NULL,
                'MODELO' VARCHAR(40) NULL,
                'VALORDOSEGURO' FLOAT,
                'VALORDALOCACAO' FLOAT,
                'COR' VARCHAR(40) NULL,
                'ATIVO' BOOLEAN);

                CREATE TABLE 'Cliente' (
                'IDCLIENTE' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                'RG' VARCHAR(11) NULL,
                'CPF' VARCHAR(11) NULL,
                'NOME' VARCHAR(40) NULL,
                'ENDERECO' VARCHAR(50) NULL,
                'CNH' VARCHAR(11) NULL,
                'NUMERODEDEPENDENTES' INT NULL);

                CREATE TABLE 'Funcionario' (
                'IDFUNCIONARIO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                'RG' VARCHAR(11) NULL,
                'CPF' VARCHAR(11) NULL,
                'NOME' VARCHAR(40) NULL,
                'ENDERECO' VARCHAR(50) NULL,
                'DATADEADMISSAO' DATE NULL,
                'DATADEDEMISSAO' DATE NULL,
                'SUPERVISOR' BOOLEAN);

                 CREATE TABLE 'Locacao' (
                'IDLOCACAO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                'NOME' VARCHAR(40) NULL,
                'MARCA' VARCHAR(40) NULL,
                'MODELO' VARCHAR(40) NULL,
                'VALORDOSEGURO' FLOAT,
                'VALORDALOCACAO' FLOAT,
                'COR' VARCHAR(40) NULL,
                'ATIVO' BOOLEAN,
                'DATADELOCACAO' DATE NULL,
                'DATADEDEVOLUCAO' DATE NULL,
                'QUILOMETRAGEM' FLOAT);

                CREATE TABLE 'Pessoa' (
                'IDPESSOA' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
                'RG' VARCHAR(11) NULL,
                'CPF' VARCHAR(11) NULL,
                'NOME' VARCHAR(40) NULL,
                'ENDERECO' VARCHAR(50) NULL););

        sqLiteDatabase.execSQL(sb.toString());



        sqLiteDatabase.execSQL(sb.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
