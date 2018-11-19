package com.example.brunab.projeto.telas;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.entidade.Carro;

public class tela_cadastro_carro extends AppCompatActivity {
    EditText edNome;
    EditText edMarca;
    EditText edPlaca;
    EditText edModelo;
    EditText edCor;
    EditText edValorlocacao;
    EditText edValorseguro;
    CheckBox cbAtivo;
    Carro carro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_carro);
        edNome=findViewById(R.id.edNomeCarro);
        edPlaca = findViewById(R.id.edPlaca);
        edMarca = findViewById(R.id.edMarca);
        edModelo = findViewById(R.id.edModelo);
        edCor = findViewById(R.id.edCor);
        edValorlocacao = findViewById(R.id.edValorlocacao);
        edValorseguro = findViewById(R.id.edValorseguro);
        cbAtivo = findViewById(R.id.cbVeiculoativo);
        
    }

    public void acaoSalvar(){
        carro.setNome(edNome.getText().toString());
        carro.setPlaca(edPlaca.getText().toString());
        carro.setMarca(edMarca.getText().toString());
        carro.setModelo(edModelo.getText().toString());
        carro.setCor(edCor.getText().toString());
        carro.setValorLocacao(Float.parseFloat(edValorlocacao.getText().toString()));
        carro.setValorLocacao(Float.parseFloat(edValorseguro.getText().toString()));
        carro.setAtivo(cbAtivo.isChecked());

    }

    private SQLiteDatabase db;
    public void inserir(){
        ContentValues campos= new ContentValues();
        campos.put("NOME",carro.getNome());
        campos.put("MARCA",carro.getMarca());
        campos.put("MODELO",carro.getModelo());
        campos.put("VALORDOSEGURO",carro.getValorSeguro());
        campos.put("VALORDALOCACAO",carro.getValorLocacao());
        campos.put("COR",carro.getCor());
        campos.put("ATIVO",carro.getAtivo());
        campos.put("PLACA",carro.getPlaca());
        /*if(.getId()<=0)
            db.insertOrThrow("VEICULO",null,campos);
        else
            db.update("VEICULO",campos,
                    "ID=?",new String[]{veiculo.getId()+""});

        db.close();
        */
    }






}
