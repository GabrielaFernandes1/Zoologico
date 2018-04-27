/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Animais;

import java.util.List;

/**
 *
 * @author SATC
 */
public class zoologico {
    int id;
    List<Animal> animais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        String listaAnimais = " ";
        for (Animal animal : animais){
            listaAnimais += "\n" + animal.getDescricao();
        }
        
        return "zoologico{" + "id=" + id + ", Animais= " + listaAnimais + '}';
    }
    
    
}
