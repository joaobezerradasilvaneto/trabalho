package com.example.brunab.projeto.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.brunab.projeto.R;
import com.example.brunab.projeto.telas.MainActivity;

public class tela_Funcionario extends AppCompatActivity {

    private Button btsalvar;
    private Button btcancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcionario);

    }
    public void acaocCancela (View view){
        finish();
    }

    public void acaoSave(View view){

    }

}
