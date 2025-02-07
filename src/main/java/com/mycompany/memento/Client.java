/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.memento;

import com.mycompany.business.Produto;

/**
 *
 * @author romerson.nogueira
 */
public class Client {

    public static void main(String[] args) throws Exception {

    Produto produto = new Produto("Caderno", 13.20, 19.60);
    
    System.out.println("Instacia criada" + " " + produto);
    Zelador zelador = Zelador.getInstancia();
    
    zelador.adicionarMemento(produto.criarProduto());
    
    produto.setCusto(21.0);
    System.out.println("Custo apos alteracao" + " " + produto);
    
    zelador.adicionarMemento(produto.criarProduto());
    
    /*Estados desfeitos*/
    produto.restaurar(zelador.desfazer());
    System.out.println("Apos desfazer" + " " + produto);
    
    /*Estados refeitos*/
    produto.restaurar(zelador.refazer());
    System.out.println("Apos refazer" + " " + produto);
    
    }

}
