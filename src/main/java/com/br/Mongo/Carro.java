package com.br.Mongo;

public class Carro {
    private String modelo;
    private String ano;
    private String valor;

    public Carro() {
    }

    public Carro(String modelo, String ano, String valor) {
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
