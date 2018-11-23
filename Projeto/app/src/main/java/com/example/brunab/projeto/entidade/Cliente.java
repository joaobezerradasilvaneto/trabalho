package com.example.brunab.projeto.entidade;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{
    private String cnh;
    private Integer numeroDeDependentes;


    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }
}
