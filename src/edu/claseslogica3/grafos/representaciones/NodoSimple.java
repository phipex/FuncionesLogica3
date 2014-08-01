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
public class NodoSimple {

        public int dato;
        public NodoSimple liga;

    @Override
    public String toString() {
        return "NodoSimple{" + "dato=" + dato + ", liga=" + liga + '}';
    }

        public NodoSimple(int dato) {
            this.dato = dato;
        }
    }
