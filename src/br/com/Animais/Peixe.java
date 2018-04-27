/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Animais;

/**
 *
 * @author SATC
 */
public class Peixe extends Animal {
    private String tipo;

    @Override
    public String toString() {
        return "Peixe{" + "tipo=" + tipo + '}';
    }
    
    

    public Peixe(int id, String descricao, char status) {
        super(id, descricao, status);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
