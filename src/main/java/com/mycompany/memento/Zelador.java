/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.memento;

import com.mycompany.business.MementoProduto;
import java.util.Stack;

/**
 *
 * @author romerson.nogueira
 */
public class Zelador {
    private final Stack<MementoProduto> elementos, elementosDesfeitos;
    private static Zelador instancia;
       
    private Zelador() {
       this.elementos = new Stack<>();
       this.elementosDesfeitos = new Stack<>();
    }

   public static Zelador getInstancia() {
       if (instancia == null) {
           instancia = new Zelador();
       }
       return instancia;
   }
       
    void adicionarMemento(MementoProduto memento) throws Exception{
        this.elementos.push(memento);
        this.elementosDesfeitos.clear();
    }
    
    /* ia fazer com elentos.size mais pesquisei e vi que existe esse peek, não sou familiarizado mais deu certo*/
    public MementoProduto desfazer() throws Exception {
        if (!elementos.isEmpty()) {
            MementoProduto desfeito = elementos.pop();
            elementosDesfeitos.push(desfeito); 
            return elementos.peek(); 
        }
        throw new Exception("Não há estados para desfazer.");
    }
    
    public MementoProduto refazer() throws Exception {
        if (!elementosDesfeitos.isEmpty()) {
            MementoProduto refeito = elementosDesfeitos.pop();
            elementos.push(refeito);
            return refeito;
        }
        throw new Exception("Não há estados para refazer.");
    }
}
