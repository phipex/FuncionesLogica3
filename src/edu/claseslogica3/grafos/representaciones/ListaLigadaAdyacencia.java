/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.claseslogica3.grafos.representaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sony vaio
 */
public class ListaLigadaAdyacencia {

    public int n;

    public List<NodoSimple> vec;

    public ListaLigadaAdyacencia() {
        inicializa(4);
        creaMatrizG1();
    }

    public ListaLigadaAdyacencia(int n) {
        inicializa(n);
    }

    public void inicializa(int n1) {
        this.n = n1;
        vec = new ArrayList(n1);
        
        for (int i = 0; i < n; i++) {
            vec.add(new NodoSimple(i));
        }
    }

    public void creaMatrizG1() {
        
        NodoSimple vertice1 = new NodoSimple(1);
        
        NodoSimple lado = new NodoSimple(2);
        vertice1.liga = lado;
        lado.liga = vertice1;
        
        
        
    }

    public void pintaGrafo(){
        for (NodoSimple nodoSimple : vec) {
            System.out.print(nodoSimple.dato+" - ");
            NodoSimple nodo = nodoSimple.liga;
            while (nodo != null && nodo != nodoSimple) {                
                System.out.print(nodo.dato+" ");
                nodo= nodo.liga;
                        
            }
            System.out.println("");
        }
    
    }
    
    
}
