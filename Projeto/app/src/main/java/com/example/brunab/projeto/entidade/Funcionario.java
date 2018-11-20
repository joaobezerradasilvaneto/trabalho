package com.example.brunab.projeto.entidade;

import java.io.Serializable;
import java.util.Date;

public class Funcionario extends Pessoa implements Serializable{

    private Date datadeAdmissao;
    private Date datadeDemissao;
    private boolean supervisor;

    private Integer idFuncionario;

    public Funcionario(){idFuncionario=0;}

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }


    public String toString(){
        return String.format("Nome: \n CPF: \n RG: \n Endereco: ", getNome(),getCpf(),getRg(),getEndereco());
    }


}

