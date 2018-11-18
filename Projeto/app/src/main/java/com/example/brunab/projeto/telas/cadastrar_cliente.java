package com.example.brunab.projeto.telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.dao.database;
import com.example.brunab.projeto.entidade.Cliente;

public class cadastrar_cliente extends AppCompatActivity {
     private Button btSalvar;
     private Button btCancelar;
     private Cliente cliente;

     database BancoBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);
        btCancelar = findViewById(R.id.btCancelar);
        btSalvar = findViewById(R.id.btSalvar);

    }

    public void acaoCancelar(View v){
        finish();
    }

    public void acaoSalvar(){

    }
}
