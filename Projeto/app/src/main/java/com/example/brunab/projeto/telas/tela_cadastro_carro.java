package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.dao.database;
import com.example.brunab.projeto.entidade.Carro;

public class tela_cadastro_carro extends AppCompatActivity {
    private EditText edNome;
    private EditText edMarca;
    private EditText edPlaca;
    private EditText edModelo;
    private EditText edCor;
    private EditText edValorlocacao;
    private EditText edValorseguro;
    private CheckBox cbAtivo;
    Carro carro;
    database banco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_carro);

        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        banco = new database(this);
        db = banco.getWritableDatabase();

        edNome=findViewById(R.id.edNomeCarro);
        edPlaca = findViewById(R.id.edPlaca);
        edMarca = findViewById(R.id.edMarca);
        edModelo = findViewById(R.id.edModelo);
        edCor = findViewById(R.id.edCor);
        edValorlocacao = findViewById(R.id.edValorlocacao);
        edValorseguro = findViewById(R.id.edValorseguro);
        cbAtivo = findViewById(R.id.cbVeiculoativo);
    }

    public void acaocancel(View view){finish();}

    public void acaoSalvar(View v){

        if(valida()){
            if(carro==null)
                carro = new Carro();
            carro.setNome(edNome.getText().toString());
            carro.setPlaca(edPlaca.getText().toString());
            carro.setMarca(edMarca.getText().toString());
            carro.setModelo(edModelo.getText().toString());
            carro.setCor(edCor.getText().toString());
            carro.setValorLocacao(Float.parseFloat(edValorlocacao.getText().toString()));
            carro.setValorLocacao(Float.parseFloat(edValorseguro.getText().toString()));
            carro.setAtivo(cbAtivo.isChecked());
            inserir();
            finish();
        }
    }

    private SQLiteDatabase db;

    public void inserir(){
        try {
            ContentValues campos = new ContentValues();
            campos.put("NOME", carro.getNome());
            campos.put("MARCA", carro.getMarca());
            campos.put("MODELO", carro.getModelo());
            campos.put("VALORDOSEGURO", carro.getValorSeguro());
            campos.put("VALORDALOCACAO", carro.getValorLocacao());
            campos.put("COR", carro.getCor());
            campos.put("ATIVO", carro.getAtivo());
            campos.put("PLACA", carro.getPlaca());

            if (carro.getId() <= 0)
                db.insertOrThrow("CARRO", null, campos);
            else
                db.update("CARRO", campos,
                        "ID=?", new String[]{carro.getId() + ""});

            db.close();
            Toast.makeText(getApplicationContext(),"Veículo salvo com sucesso!",Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(getApplicationContext(),"Erro ao inserir veículo",Toast.LENGTH_LONG).show();
        }

    }

    private boolean valida(){
        if(TextUtils.isEmpty(edNome.getText())){
            Toast.makeText(this,"Entre com o nome",Toast.LENGTH_LONG).show();
            edNome.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edPlaca.getText())){
            Toast.makeText(this,"Entre com a placa",Toast.LENGTH_LONG).show();
            edPlaca.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edMarca.getText())){
            Toast.makeText(this,"Entre com a Marca",Toast.LENGTH_LONG).show();
            edMarca.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edModelo.getText())){
            Toast.makeText(this,"Entre com o Modelo",Toast.LENGTH_LONG).show();
            edModelo.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edCor.getText())){
            Toast.makeText(this,"Entre com a cor",Toast.LENGTH_LONG).show();
            edCor.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edValorlocacao.getText())){
            Toast.makeText(this,"Entre com o valor da locação",Toast.LENGTH_LONG).show();
            edValorlocacao.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(edValorseguro.getText())){
            Toast.makeText(this,"Entre com o valor do seguro",Toast.LENGTH_LONG).show();
            edValorseguro.requestFocus();
            return false;
        }

        return true;
    }




}
