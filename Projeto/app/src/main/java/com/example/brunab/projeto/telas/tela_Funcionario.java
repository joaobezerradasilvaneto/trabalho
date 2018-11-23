package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
    private EditText edAdmissao;
    private EditText edDemissao;
    private EditText edcargo;


    private SQLiteDatabase db;
    database banco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcionario);

        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        banco = new database(this);
        db=banco.getWritableDatabase();

        edNome = findViewById(R.id.edNomeFuncionario);
        edCpf = findViewById(R.id.edCPFfuncionario);
        edRG = findViewById(R.id.edRGfuncionario);
        edEndereco = findViewById(R.id.edEnderecofuncionario);
        edcargo = findViewById(R.id.edCargo);
        edAdmissao = findViewById(R.id.edDataAdmissao);
        edDemissao = findViewById(R.id.edDataDemissao);

    /*
        funcionario = (Funcionario) getIntent().getSerializableExtra("funcionario");
        if (funcionario != null){
            edNome.setText(funcionario.getNome()+"");
            edCpf.setText(funcionario.getCpf()+"");
            edRG.setText(funcionario.getRg()+"");
            edEndereco.setText(funcionario.getEndereco()+"");
            edcargo.setText(funcionario.getCargo());
        }
        */
    }
    public void acaoCancela (View view){
        finish();
    }

    public void acaoSalvar(View view){

        if (valida()) {
            if (funcionario == null) {
                funcionario = new Funcionario();
            }
            funcionario.setNome(edNome.getText().toString());
            funcionario.setCpf(edCpf.getText().toString());
            funcionario.setEndereco(edEndereco.getText().toString());
            funcionario.setRg(edRG.getText().toString());
            inserir();
            finish();
        }
<<<<<<< HEAD
        funcionario.setNome(edNome.getText().toString());
        funcionario.setCpf(edCpf.getText().toString());
        funcionario.setEndereco(edEndereco.getText().toString());
        funcionario.setRg(edRG.getText().toString());
        funcionario.setCargo(edcargo.getText().toString());
        inserir();
        finish();
    }

    public void inserir(){
        ContentValues campos= new ContentValues();
        campos.put("NOME",funcionario.getNome());
        campos.put("RG",funcionario.getRg());
        campos.put("CPF",funcionario.getCpf());
        campos.put("ENDERECO",funcionario.getEndereco());
        campos.put("CARGO", funcionario.getCargo());

        if (funcionario.getIdFuncionario()<=0)
            db.insertOrThrow("Funcionario", null, campos);
        else
            db.update("Funcionario", campos, "IDFUNCIONARIO=?", new String[]{funcionario.getIdFuncionario()+""});

        db.close();
=======
    }

    public void inserir(){

        try {
            ContentValues campos = new ContentValues();
            campos.put("NOME", funcionario.getNome());
            campos.put("RG", funcionario.getRg());
            campos.put("CPF", funcionario.getCpf());
            campos.put("ENDERECO", funcionario.getEndereco());

            if (funcionario.getIdFuncionario() <= 0)
                db.insertOrThrow("FUNCIONARIO", null, campos);
            else
                db.update("FUNCIONARIO", campos, "ID=?", new String[]{funcionario.getIdFuncionario() + ""});

            db.close();
            Toast.makeText(getApplicationContext(),"Funcionário Salvo com Sucesso!",Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),"Erro ao inserir funcionario",Toast.LENGTH_LONG).show();
        }
    }

    private boolean valida() {
        if(TextUtils.isEmpty(edNome.getText())){
            Toast.makeText(this,"Entre com o nome",Toast.LENGTH_LONG).show();
            edNome.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edCpf.getText())){
            Toast.makeText(this,"Entre com o CPF",Toast.LENGTH_LONG).show();
            edCpf.requestFocus();
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

        return true;
>>>>>>> 85777e67ce8d2fd76bd735987c20fdefd6fcaab7
    }


}
