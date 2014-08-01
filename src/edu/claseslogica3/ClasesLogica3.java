/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3;

import edu.claseslogica3.grafos.representaciones.MatrizAdyacencia;
import edu.claseslogica3.grafos.representaciones.TransformarRepresentaciones;

/**
 *
 * @author sony vaio
 */
public class ClasesLogica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TransformarRepresentaciones.llamaMatrizAdya2ListaAdya();
        
        TransformarRepresentaciones.llamaMatrizAdya2MultilistaAdya();
        
        TransformarRepresentaciones.llamaMatrizAdya2MatrizInci();
        
        TransformarRepresentaciones.llamaMatrizInci2MatrizAdya();
    }
    
}
