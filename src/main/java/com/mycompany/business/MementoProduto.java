/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.business;

/**
 *
 * @author romerson.nogueira
 */
public class MementoProduto {
    
    private String nome;
    private double custo;
    private double preco;

    public MementoProduto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public double getPreco() {
        return preco;
    }
    
    
}
