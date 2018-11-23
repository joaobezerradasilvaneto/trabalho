package com.example.brunab.projeto.entidade;

import java.io.Serializable;
import java.util.Date;

public class Funcionario extends Pessoa implements Serializable{

    private Date datadeAdmissao;
    private Date datadeDemissao;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDatadeAdmissao() {
        return datadeAdmissao;
    }

    public void setDatadeAdmissao(Date datadeAdmissao) {
        this.datadeAdmissao = datadeAdmissao;
    }

    public Date getDatadeDemissao() {
        return datadeDemissao;
    }

    public void setDatadeDemissao(Date datadeDemissao) {
        this.datadeDemissao = datadeDemissao;
    }

    public boolean isSupervisor() {
        return supervisor;
    }

    public void setSupervisor(boolean supervisor) {
        this.supervisor = supervisor;
    }

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

