/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3.listaligadageneralizada;

/**
 *  Clase que representa un nodo de la lista ligada generalizada
 * @author Andres Felipe Montoya
 * @param <T>
 */
public abstract class NodoLista<T> implements Comparable<T>{
    
    /**
     * Apunta al siquiente nodo en la lista
     */
    public NodoLista liga;
    
    /**
     * Objeto que contiene el dato del nodo segun la siguiente conversion
     * si sw es true, dato es nulo y subarbol contiene un apuntador a nodo del subarbol
     * si sw es false, dato contiene un dato y subarbol es nulo
     */
    public T dato;
    
    /**
     * Objeto que contiene una lida al nodo de una sublista segun la siguiente conversion
     * si sw es true, dato es nulo y subarbol contiene un apuntador a nodo del subarbol
     * si sw es false, dato contiene un dato y subarbol es nulo
     */
    public NodoLista subarbol;
    
    /**
     * bandera que define si el nodo actual contien un dato o es el principio de un subarbol
     * true: contiene liga a un subarbol
     * false: contiene dato
     */
    public boolean sw;

    
    /**
     * Constructor que inicializa el nodo como contenedor de un dato
     * @param liga apuntador al siguiente hijo
     * @param dato dato en el nodo
     */
    public NodoLista(NodoLista liga, T dato) {
        this.liga = liga;
        this.dato = dato;
        this.sw = false;
    }

    /**
     * Constructor que inicializa el nodo como contenedor de un dato
     * @param dato dato en el nodo
     */
    public NodoLista(T dato) {
        this.dato = dato;
        this.sw = false;
    }

    /**
     * Constructor que inicializa el nodo como un subarbol
     * @param liga apuntador al siguiente hijo
     * @param subarbol apuntador al subarbol
     */
    public NodoLista(NodoLista liga, NodoLista subarbol) {
        this.liga = liga;
        this.subarbol = subarbol;
        this.sw = true;
    }
    
    public abstract NodoLista convierteSubArbol();
    
}
