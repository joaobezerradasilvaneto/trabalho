package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.dao.database;
import com.example.brunab.projeto.entidade.Cliente;

import java.sql.SQLException;

public class cadastrar_cliente extends AppCompatActivity {

     private Cliente cliente;
     private EditText edNome ;
     private EditText edCPF;
     private EditText edRG;
     private EditText edEndereco;
     private EditText edCNH;
     private EditText edDependentes;
     database banco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        edNome = findViewById(R.id.edNome);
        edCPF = findViewById(R.id.edCPF);
        edRG = findViewById(R.id.edRG);
        edEndereco = findViewById(R.id.edEndereco);
        edCNH = findViewById(R.id.edCNH);
        edDependentes = findViewById(R.id.edDependentes);

        //banco
        banco = new database(this);
        db = banco.getWritableDatabase();

    }

    public void acaoCancelar(View v){
        finish();
    }

    public void acaoSalvar(View v){
        if(valida()) {
            if(cliente==null){
                cliente = new Cliente();
            }
            cliente.setNome(edNome.getText().toString());
            cliente.setCpf(edCPF.getText().toString());
            cliente.setRg(edRG.getText().toString());
            cliente.setEndereco(edEndereco.getText().toString());
            cliente.setCnh(edCNH.getText().toString());
            cliente.setNumeroDeDependentes(Integer.parseInt(edDependentes.getText().toString()));
            inserir();
            finish();
        }

    }


    private boolean valida() {
        if(TextUtils.isEmpty(edNome.getText())){
            Toast.makeText(this,"Entre com o nome",Toast.LENGTH_LONG).show();
            edNome.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edCPF.getText())){
            Toast.makeText(this,"Entre com o CPF",Toast.LENGTH_LONG).show();
            edCPF.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edRG.getText())){
            Toast.makeText(this,"Entre com o RG",Toast.LENGTH_LONG).show();
            edRG.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edEndereco.getText())){
            Toast.makeText(this,"Entre com o Endereço",Toast.LENGTH_LONG).show();
            edEndereco.requestFocus();
            return false;
        }

        if(TextUtils.isEmpty(edCNH.getText())){
            Toast.makeText(this,"Entre com o CNH",Toast.LENGTH_LONG).show();
            edCNH.requestFocus();
            return false;
        }

        if(TextUtils.isEmpty(edDependentes.getText())){
            Toast.makeText(this,"Entre com o número de dependentes",Toast.LENGTH_LONG).show();
            edDependentes.requestFocus();
            return false;
        }
        return true;
    }

    private SQLiteDatabase db;
    private void inserir(){

        try {
            ContentValues campos = new ContentValues();
            campos.put("NOME", cliente.getNome());
            campos.put("CPF", cliente.getCpf());
            campos.put("RG", cliente.getRg());
            campos.put("ENDERECO", cliente.getEndereco());
            campos.put("CNH", cliente.getCnh());
            campos.put("NUMERODEDEPENDENTES", cliente.getNumeroDeDependentes());

            if(cliente.getId()<=0)
                db.insertOrThrow("CLIENTE",null,campos);
            else
                db.update("CLIENTE",campos,"ID=?",new String[]{cliente.getId()+""});

            db.close();
            Toast.makeText(getApplicationContext(),"Cliente salvo com sucesso!",Toast.LENGTH_LONG).show();

        }catch(Exception e){
            Toast.makeText(this,"Erro ao inserir cliente",Toast.LENGTH_LONG).show();
        }
    }



}
