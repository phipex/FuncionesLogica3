/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.claseslogica3.grafos.representaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sony vaio
 */
public class MultilistaAdyacencias {

    public int n;

    public List<NodoMultiAdya> vec;

    public List<NodoMultiAdya> auxiliar;
    
    public void inicializa(int n1) {
        this.n = n1;
        vec = new ArrayList(n1);
        auxiliar = new ArrayList();
        for (int i = 0; i < n; i++) {
            vec.add(null);
        }
        
    }

    public MultilistaAdyacencias(int n) {
        inicializa(n);
        
    }

    public void pintaGrafo() {
        System.out.println("auxiliar");
        for (NodoMultiAdya nodoMultiAdya : auxiliar) {
            System.out.println(nodoMultiAdya);
        }
        System.out.println("vec");
        for (NodoMultiAdya nodoMultiAdya : vec) {
            System.out.println(nodoMultiAdya);
        }
    }
    
}
