/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3.grafos.representaciones;

/**
 *
 * @author sony vaio
 */
public class NodoMultiAdya {
    
    int verticeI;
    int verticeJ;
    NodoMultiAdya ligaVi;
    NodoMultiAdya ligaVj;
    boolean sw;

    public NodoMultiAdya(int verticeI, int verticeJ) {
        this.verticeI = verticeI;
        this.verticeJ = verticeJ;
    }

    @Override
    public String toString() {
        return "NodoMultiAdya{" + "verticeI=" + verticeI + ", verticeJ=" + verticeJ + '}';
    }
    
    
    
}
