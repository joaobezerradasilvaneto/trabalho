package com.example.brunab.projeto.entidade;

public class Carro {
    String placa;
    String nome;
    String modelo;
    String marca;
    Float valorSeguro;
    Float valorLocacao;
    String cor;
    Boolean ativo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(Float valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public Float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(Float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
