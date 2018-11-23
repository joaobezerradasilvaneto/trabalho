package com.example.brunab.projeto.telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brunab.projeto.R;

public class tela_locacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_locacao);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
}
