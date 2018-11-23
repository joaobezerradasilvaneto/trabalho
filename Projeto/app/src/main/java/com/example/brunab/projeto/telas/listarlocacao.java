package com.example.brunab.projeto.telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brunab.projeto.R;

public class listarlocacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarlocacao);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
}
