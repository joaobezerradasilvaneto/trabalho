package com.example.brunab.projeto.entidade;

import java.io.Serializable;
import java.util.Date;

public class Funcionario extends Pessoa implements Serializable{

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Date datadeAdmissao;
    private Date datadeDemissao;
    private boolean supervisor;

    public Funcionario(){id=0;};

}
