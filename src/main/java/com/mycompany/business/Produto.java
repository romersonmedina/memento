/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.business;

import com.mycompany.business.MementoProduto;

/**
 *
 * @author romerson.nogueira
 */
public class Produto {
    
    private String nome;
    private double custo;
    private double preco;

    public Produto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public MementoProduto criarProduto() {
        return new MementoProduto(nome, custo, preco);
    }
    
    public void restaurar(MementoProduto memento){
        this.nome = memento.getNome();
        this.custo = memento.getCusto();
        this.preco = memento.getPreco();
    }
    
    @Override
    public String toString() {
    return "Produto: " + getNome()+ " "  + "Valor Custo: " + getCusto()+ " " + "Preco produto: " + getPreco();
    }
}
