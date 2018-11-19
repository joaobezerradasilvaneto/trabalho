package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.entidade.Cliente;

public class cadastrar_cliente extends AppCompatActivity {

     private Cliente cliente;
     private EditText edNome ;
     private EditText edCPF;
     private EditText edRG;
     private EditText edEndereco;
     private EditText edCNH;
     private EditText edDependentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);
        edNome = findViewById(R.id.edNome);
        edCPF = findViewById(R.id.edCPF);
        edRG = findViewById(R.id.edRG);
        edEndereco = findViewById(R.id.edEndereco);
        edCNH = findViewById(R.id.edCNH);
        edDependentes = findViewById(R.id.edDependentes);

    }

    public void acaoCancelar(View v){
        finish();
    }

    public void acaoSalvar(){
        cliente.setNome(edNome.getText().toString());
        cliente.setCpf(edCPF.getText().toString());
        cliente.setRg(edRG.getText().toString());
        cliente.setEndereco(edEndereco.getText().toString());
        cliente.setCnh(edCNH.getText().toString());
        cliente.setNumeroDeDependentes(Integer.parseInt(edDependentes.getText().toString()));

    }

    public void inserir(){
        ContentValues campos= new ContentValues();
        campos.put("NOME",cliente.getNome());
        campos.put("CPF",cliente.getCpf());
        campos.put("RG",cliente.getRg());
        campos.put("ENDERECO",cliente.getEndereco());
        campos.put("CNH",cliente.getCnh());
        campos.put("DEPENDENTES",cliente.getNumeroDeDependentes());
    }



}
