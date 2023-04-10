package br.com.springboot.model;


public enum Sexo {

    masculino("masculino"),
    feminino ("feminino");


    private String descricao;

    Sexo(String descricao) {
        this.descricao= descricao;
    }

    public String getDescricao () {
        return this.descricao;
    }



}