/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3.matriz.tripletas;

/**
 *
 * @author sony vaio
 */
public class Tripleta {
    
    private int fila;
    private int columna;
    private int valor;

    public Tripleta(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println(toString());
    }

    
    @Override
    public String toString() {
        return "fila: "+fila +" columna: "+columna + " valo:"+valor;
    }
    
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
}
