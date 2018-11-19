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
        String sql= "CREATE TABLE 'Carro' (\n" +
                "  'IDCARRO' INT NOT NULL,\n" +
                "  'NOME' VARCHAR(40) NULL,\n" +
                "  'MARCA' VARCHAR(40) NULL,  \n" +
                "  'MODELO' VARCHAR(40) NULL,\n" +
                "  'VALORDOSEGURO' FLOAT,  \n" +
                "  'VALORDALOCACAO' FLOAT,  \n" +
                "  'COR' VARCHAR(40) NULL,\n" +
                "  'ATIVO' BOOLEAN,\n" +
                "   PRIMARY KEY ('IDCARRO'));\n" +

                "CREATE TABLE 'Cliente' (\n" +
                "  'IDCLIENTE' INT NOT NULL,\n" +
                "  'RG' VARCHAR(11) NULL,\n" +
                "  'CPF' VARCHAR(11) NULL,\n" +
                "  'NOME' VARCHAR(40) NULL,\n" +
                "  'ENDERECO' VARCHAR(50) NULL,\n" +
                "  'CNH' VARCHAR(11) NULL,\n" +
                "  'NUMERODEDEPENDENTES' INT NULL,\n" +
                "  PRIMARY KEY ('IDCLIENTE'));\n" +

                "CREATE TABLE 'Funcionario' (\n" +
                "  'IDFUNCIONARIO' INT NOT NULL,\n" +
                "  'RG' VARCHAR(11) NULL,\n" +
                "  'CPF' VARCHAR(11) NULL,\n" +
                "  'NOME' VARCHAR(40) NULL,\n" +
                "  'ENDERECO' VARCHAR(50) NULL,\n" +
                "  'DATADEADMISSAO' DATE NULL,\n" +
                "  'DATADEDEMISSAO' DATE NULL,\n" +
                "  'SUPERVISOR' BOOLEAN,\n" +
                "  PRIMARY KEY ('IDFUNCIONARIO'));\n" +

                "CREATE TABLE 'Locacao' (\n" +
                "  'IDLOCACAO' INT NOT NULL,\n" +
                "  'NOME' VARCHAR(40) NULL,\n" +
                "  'MARCA' VARCHAR(40) NULL,  \n" +
                "  'MODELO' VARCHAR(40) NULL,\n" +
                "  'VALORDOSEGURO' FLOAT,  \n" +
                "  'VALORDALOCACAO' FLOAT,  \n" +
                "  'COR' VARCHAR(40) NULL,\n" +
                "  'ATIVO' BOOLEAN,\n" +
                "  'DATADELOCACAO' DATE NULL,\n" +
                "  'DATADEDEVOLUCAO' DATE NULL,\n" +
                "  'QUILOMETRAGEM' FLOAT, \n" +
                "   PRIMARY KEY ('IDLOCACAO'));\n" +

                "CREATE TABLE 'Pessoa' (\n" +
                "  'IDPESSOA' INT NOT NULL,\n" +
                "  'RG' VARCHAR(11) NULL,\n" +
                "  'CPF' VARCHAR(11) NULL,\n" +
                "  'NOME' VARCHAR(40) NULL,\n" +
                "  'ENDERECO' VARCHAR(50) NULL,\n" +
                "  PRIMARY KEY ('IDPESSOA'));";

        sqLiteDatabase.execSQL(sql);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
