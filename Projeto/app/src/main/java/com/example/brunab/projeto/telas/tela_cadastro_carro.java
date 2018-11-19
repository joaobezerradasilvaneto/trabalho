package com.example.brunab.projeto.telas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.brunab.projeto.R;

public class tela_cadastro_carro extends AppCompatActivity {
    EditText edNome = new EditText();
    EditText edMarca =new EditText();
    EditText edPlaca = new EditText();
    EditText edModelo = new EditText();
    EditText edCor = new EditText();
    EditText edValorlocacao = new EditText();
    EditText edValorseguro = new EditText();
    CheckBox cbAtivo = new CheckBox();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_carro);
        edNome=findViewById(R.id.edNome);
        edPlaca = findViewById(R.id.edPlaca);
        edMarca = findViewById(R.id.edMarca);
        edModelo = findViewById(R.id.edModelo);
        edCor = findViewById(R.id.edCor);
        edValorlocacao = findViewById(R.id.edValorlocacao);
        edValorseguro = findViewById(R.id.edValorseguro);
        
    }

}
