package com.example.demo.model;

public class ProductModel {
    public String nome;
    public String descricao;
    public double preco;
    public int categoria;

    public ProductModel(String nome, String descricao, double preco, int categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

}
