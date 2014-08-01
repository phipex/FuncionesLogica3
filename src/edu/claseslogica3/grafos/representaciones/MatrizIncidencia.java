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
public class MatrizIncidencia {
    int numeroLados;
    int numeroVertices;

    int[][] inci; 
    
    public MatrizIncidencia(int numeroVertices,int numeroLados) {
        this.numeroLados = numeroLados;
        this.numeroVertices = numeroVertices;
        this.inci = new int[numeroVertices][numeroLados];
        
    }
    
    public void pintaMatriz(){
        if(inci != null){
            for (int i = 0; i < numeroVertices; i++) {
                for (int j = 0; j < numeroLados; j++) {
                    int is = inci[i][j];
                    System.out.print(is+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("No tiene creada la matriz");
        }
        
    }
    
}
