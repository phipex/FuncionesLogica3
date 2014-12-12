/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.claseslogica3.arboles.binario.listaligada;

/**
 * Clase que representa un arbol binario representado como lista ligada
 * @author Andres Felipe Montoya @phipex aphipex@gmail.com
 * @param <T>
 */
public class ArbolBinario<T extends Comparable> {
    
    public NodoArbol raiz = null;
    
    //TODO recorrido inorden
    public void callInorden(){
        inorden(raiz);
    }
    
    public static void inorden(NodoArbol nodo){
    
        if (nodo != null) {
            
                inorden(nodo.ligaDerecha);
            
            System.out.println(""+nodo.dato.toString());
           
                inorden(nodo.ligaIzquieda);
            
            
            
        }
        
    }
    
    //TODO recorrido preorden
    public void callPreorde(){
        preorden(raiz);
    }
    
    public static void preorden(NodoArbol nodo){
    
        if (nodo != null) {
            System.out.println(""+nodo.dato.toString());
            
                preorden(nodo.ligaDerecha);
            
            
            
                preorden(nodo.ligaIzquieda);
            
            
            
        }
        
    }
    //TODO recorrido posorden
    public void callPostorden(){
        Postorden(raiz);
    }
    
    public static void Postorden(NodoArbol nodo){
    
        if (nodo != null) {
           
                inorden(nodo.ligaDerecha);
            
                inorden(nodo.ligaIzquieda);
            
            System.out.println(""+nodo.dato.toString());
            
        }
        
    }
    //TODO numero de hojas
    public int numeroHojasArbol(){
        int numero = numeroHojas(raiz);
        
        return numero;
    }
    
    public static int numeroHojas(NodoArbol nodo)
    {
        if(nodo != null)
        {
            return 0;
        }
        if(nodo.ligaDerecha != null && nodo.ligaIzquieda != null)
        {
            return 1;
        }
        int numero = 0;
        numero = numero + numeroHojas(nodo.ligaDerecha);
        numero = numero + numeroHojas(nodo.ligaIzquieda);
        return numero;
        
    }
    //TODO grado de un arbol
    
    
    //TODO altura de un arbol
    public int callAltura()
    {
        return altura(raiz);
    }
    
    public static int altura(NodoArbol nodo)
    {
        if(nodo != null)
        {
            return 0;
        }
        if(nodo.ligaDerecha == null && nodo.ligaIzquieda == null)
        {
            return 1;
        }
        int numero = 0;
        numero = numero + numeroHojas(nodo.ligaDerecha);
        numero = numero + numeroHojas(nodo.ligaIzquieda);
        return numero;
        
    }
            
    //TODO padre de un registro
    //TODO retornar ancestros de un registro
    //TODO imprime por niveles
    //TODO binario de un n-ario como lista ligaada generalizad
    //TODO contruir a partir de inorden y preorden
    //TODO de vector a lista ligada
    
    
}
