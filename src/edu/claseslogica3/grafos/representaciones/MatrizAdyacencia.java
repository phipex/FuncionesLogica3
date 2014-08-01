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
public class MatrizAdyacencia {
    
    public int[][] adya;
    
    public int n;
    
    
    
    public void pintaMatriz(){
        if(adya != null){
            for (int i = 0; i < adya.length; i++) {
                for (int j = 0; j < adya.length; j++) {
                    int is = adya[i][j];
                    System.out.print(is+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("No tiene creada la matriz");
        }
        
    }
    
    public int numeroLados(){
        int lados = 0;
    
        for (int i = 0; i < n; i++) {
            for (int j = i ; j < n; j++) {
                    int is = adya[i][j];
                    System.out.print("["+i+"]["+j+"]:"+is+" ");
                    if(adya[i][j] == 1 && adya[j][i] == 1){
                        lados++;
                    }
                    
                }
                System.out.println("");
            
        }
        System.out.println("lados: "+lados);
        return lados;
    }
    
    public void creaMatrizG1(){
        
        adya[0][1]= 1;
        adya[0][2]= 1;
        adya[0][3]= 1;
        adya[1][0]= 1;
        adya[1][2]= 1;
        adya[1][3]= 1;
        adya[2][0]= 1;
        adya[2][1]= 1;
        adya[2][3]= 1;
        adya[3][0]= 1;
        adya[3][1]= 1;
        adya[3][2]= 1;
        
    }

    public MatrizAdyacencia() {
        n = 4;
        adya = new int[n][n];
        
        creaMatrizG1();
    }
    
    public MatrizAdyacencia(int n) {
        this.n = n;
        adya = new int[n][n];
    }
}
