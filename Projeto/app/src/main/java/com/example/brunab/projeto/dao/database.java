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
                "CREATE TABLE 'Carro' (\n" +
                        "'IDCARRO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                        "'PLACA' STRING (7) NOT NULL,\n" +
                        "'NOME' VARCHAR (40),\n" +
                        "'MARCA' VARCHAR (40),\n" +
                        "'MODELO' VARCHAR (40),\n" +
                        "'VALORDOSEGURO' FLOAT,\n" +
                        "'VALORDALOCACAO' FLOAT,\n" +
                        "'COR' VARCHAR (40),\n" +
                        "'ATIVO' BOOLEAN);\n" +

                        "CREATE TABLE 'Cliente' (\n" +
                        "'IDCLIENTE' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                        "'RG' VARCHAR(11) NULL,\n" +
                        "'CPF' VARCHAR(11) NULL,\n" +
                        "'NOME' VARCHAR(40) NULL,\n" +
                        "'ENDERECO' VARCHAR(50) NULL,\n" +
                        "'CNH' VARCHAR(11) NULL,\n" +
                        "'NUMERODEDEPENDENTES' INT NULL);\n" +

                        "CREATE TABLE 'Funcionario' (\n" +
                        "'IDFUNCIONARIO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                        "'RG' VARCHAR(11) NULL,\n" +
                        "'CPF' VARCHAR(11) NULL,\n" +
                        "'NOME' VARCHAR(40) NULL,\n" +
                        "'ENDERECO' VARCHAR(50) NULL,\n" +
                        "'DATADEADMISSAO' DATE NULL,\n" +
                        "'DATADEDEMISSAO' DATE NULL,\n" +
                        "'SUPERVISOR' BOOLEAN);\n" +

                        "CREATE TABLE 'Locacao' ( \n" +
                        "'IDLOCACAO' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, \n" +
                        "'PLACA' STRING (7) NOT NULL, \n" +
                        "'NOME' VARCHAR (40), \n" +
                        "'MARCA' VARCHAR (40), \n" +
                        "'MODELO' VARCHAR (40), \n" +
                        "'VALORDOSEGURO' FLOAT, \n" +
                        "'VALORDALOCACAO' FLOAT, \n" +
                        "'COR' VARCHAR (40), \n" +
                        "'ATIVO' BOOLEAN, \n" +
                        "'DATADELOCACAO' DATE, \n" +
                        "'DATADEDEVOLUCAO' DATE, \n" +
                        "'QUILOMETRAGEM' FLOAT);\n" +

                        "CREATE TABLE 'Pessoa' (\n" +
                        "'IDPESSOA' INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                        "'RG' VARCHAR(11) NULL,\n" +
                        "'CPF' VARCHAR(11) NULL,\n" +
                        "'NOME' VARCHAR(40) NULL,\n" +
                        "'ENDERECO' VARCHAR(50) NULL);"

        );

        sqLiteDatabase.execSQL(sb.toString());



        sqLiteDatabase.execSQL(sb.toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
