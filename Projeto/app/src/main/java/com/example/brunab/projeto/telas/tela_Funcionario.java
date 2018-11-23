package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.dao.database;
import com.example.brunab.projeto.entidade.Funcionario;
import com.example.brunab.projeto.telas.MainActivity;

public class tela_Funcionario extends AppCompatActivity {
    private Funcionario funcionario;
    private EditText edNome;
    private EditText edCpf;
    private EditText edRG;
    private EditText edEndereco;


    private SQLiteDatabase db;
    database daoBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcionario);

        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        daoBD = new database(this);
        db=daoBD.getWritableDatabase();
        edNome = findViewById(R.id.edNomeFuncionario);
        edCpf = findViewById(R.id.edCPFfuncionario);
        edRG = findViewById(R.id.edRGfuncionario);
        edEndereco = findViewById(R.id.edEnderecofuncionario);


        funcionario = (Funcionario) getIntent().getSerializableExtra("funcionario");
        if (funcionario != null){
            edNome.setText(funcionario.getNome()+"");
            edCpf.setText(funcionario.getCpf()+"");
            edRG.setText(funcionario.getRg()+"");
            edEndereco.setText(funcionario.getEndereco()+"");
        }
    }
    public void acaoCancela (View view){
        finish();
    }

    public void acaoSalvar(View view){
        if(funcionario != null){
            funcionario = new Funcionario();
        }
        funcionario.setNome(edNome.getText().toString());
        funcionario.setCpf(edCpf.getText().toString());
        funcionario.setEndereco(edEndereco.getText().toString());
        funcionario.setRg(edRG.getText().toString());
        inserir();
        finish();
    }

    public void inserir(){
        ContentValues campos= new ContentValues();
        campos.put("NOME",funcionario.getNome());
        campos.put("RG",funcionario.getRg());
        campos.put("CPF",funcionario.getCpf());
        campos.put("ENDERECO",funcionario.getEndereco());

        if (funcionario.getIdFuncionario()<=0)
            db.insertOrThrow("Funcionario", null, campos);
        else
            db.update("Funcionario", campos, "IDFUNCIONARIO=?", new String[]{funcionario.getIdFuncionario()+""});

        db.close();
    }


}
