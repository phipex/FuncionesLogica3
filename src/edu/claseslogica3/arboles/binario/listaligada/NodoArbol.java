/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.claseslogica3.arboles.binario.listaligada;

/**
 * Clase que representa un nodo de un arbol binario representado como lista ligada
 * @author Andres Felipe Montoya @phipex aphipex@gmail.com
 * @param <T> dato que extiende de comparable
 */
public class NodoArbol<T extends Comparable> {
    /**
     * Liga izquierda del nodo
     */
    public NodoArbol ligaIzquieda;
    
    /**
     * Liga derecha del nodo
     */
    public NodoArbol ligaDerecha;
    
    /**
     * Datoo del nodo
     */
    public T dato;

    /**
     * Constructor del nodo
     * @param ligaIzquieda
     * @param ligaDerecha
     * @param dato 
     */
    public NodoArbol(NodoArbol ligaIzquieda, NodoArbol ligaDerecha, T dato) {
        this.ligaIzquieda = ligaIzquieda;
        this.ligaDerecha = ligaDerecha;
        this.dato = dato;
    }
    
    
}
