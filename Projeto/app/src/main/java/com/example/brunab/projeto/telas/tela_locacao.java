package com.example.brunab.projeto.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.brunab.projeto.R;

public class tela_locacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_locacao);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void listarCliente(View view){
        Intent it = new Intent(tela_locacao.this, listar_cliente.class);
        startActivity(it);
    }
    public void ListarCarros(View view){
        Intent it = new Intent(tela_locacao.this, listar_veiculos.class);
        startActivity(it);
    }

    public void listarLocacoes(View view){
        Intent it = new Intent(tela_locacao.this, listar_locacao.class);
        startActivity(it);
    }


    public void acaoVoltar(View view){
        finish();
    }

}
