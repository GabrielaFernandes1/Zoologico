/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Animais;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Lobo extends Animal {
   private float peso, tamanho; 
   private Date datanascimento;

    @Override
    public String toString() {
        return "Lobo{" + "peso=" + peso + ", tamanho=" + tamanho + ", datanascimento=" + datanascimento + '}';
    }
    

    public Lobo(float peso, float tamanho, Date datanascimento, int id, String descricao, char status) {
        super(id, descricao, status);
        this.peso = peso;
        this.tamanho = tamanho;
        this.datanascimento = datanascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }
   
   
}
