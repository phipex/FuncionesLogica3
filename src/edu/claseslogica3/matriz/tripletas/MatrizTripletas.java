/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3.matriz.tripletas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  Clase que representa una matriz dispersa representada como tripletas
 * @author Andres Felipe (phipex) montoya
 */
public class MatrizTripletas {
    public int nFilas;
    public int nColumnas;
    public List<Tripleta> Mat; 

    public MatrizTripletas(Tripleta tripleta){
        int nTripletas = tripleta.getValor();
        
        this.Mat = new ArrayList<>();
        this.Mat.add(tripleta);
        this.nFilas = tripleta.getFila();
        this.nColumnas = tripleta.getColumna();
        for (int i = 0; i < nTripletas; i++) {
            this.Mat.add(null);
        }
        
        this.Mat.add( new Tripleta(nFilas+1, nColumnas+1, nTripletas));
        System.out.println("largo de la matriz "+this.Mat.size());
    }
    
    
    
    /**
     * Constructor de la clase
     * @param MatDispersaOriginal matriz dispersa original
     */
    public MatrizTripletas(int[][] MatDispersaOriginal) {
        
       
        this.nFilas = MatDispersaOriginal.length;
        this.nColumnas = MatDispersaOriginal[0].length;
        
        
        this.Mat = new ArrayList();
        
        Tripleta primera = new Tripleta(nFilas, nColumnas, nFilas);
        this.Mat.add(primera);
        int k = 1;        
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                int val = MatDispersaOriginal[i][j];
                if (val != 0) {
                    Tripleta nueva = new Tripleta(i, j, val);
                    this.Mat.add(nueva);
                    k++;
                }
            }
                    
        }
        primera.setValor(k);
        Tripleta ultima = new Tripleta(nFilas+1, nColumnas+1, k);
        this.Mat.add(ultima);
        
    }

    public void asignaTripleta(Tripleta tripleta, int posicion){
        this.Mat.add(posicion,tripleta);
    
    }
    
    public int retornNumeroTripletas(){
        return this.Mat.get(0).getValor();
    
    }
    
    /**
     * Imprime en consola la matriz
     */
    public void imprimirConsola(){
        System.out.println("Imprimiendo matriz");
        if (this.Mat != null) {
            for (int i = 0; i < Mat.size(); i++) {
                Tripleta tripleta = Mat.get(i);
                if (tripleta != null) {
                    System.out.print("i:"+i+" ");
                    tripleta.imprimir();
                }
            }
            
        }
       
    }
    
    public int[] contruyeVectorDeLimitesFila(){
        int[] res = null;
    
        int nTripletas = this.Mat.size();
                
        res = new int[this.nFilas +2];
        for (int i = 1; i < nTripletas; i++) {
            Tripleta tripleta = Mat.get(i);
//            tripleta.imprimir();
            res[tripleta.getFila()]=res[tripleta.getFila()]+1; 
        }
        
        res[this.nFilas]= nTripletas-1;
        System.out.println(Arrays.toString(res));
        for(int k=this.nFilas-1;k>-1;k--){
            res[k]=res[k+1]-res[k];
        }
        
        return res;
    }
    
    public int[] contruyeVectorDeLimitesColumna(){
        int[] res = null;
    
        int nTripletas = this.Mat.size();
                
        res = new int[this.nColumnas +2];
        for (int i = 1; i < nTripletas; i++) {
            Tripleta tripleta = Mat.get(i);
//            tripleta.imprimir();
            res[tripleta.getColumna()]=res[tripleta.getColumna()]+1; 
        }
        
        res[this.nColumnas]= nTripletas-1;
        System.out.println(Arrays.toString(res));
        for(int k=this.nColumnas-1;k>-1;k--){
            res[k]=res[k+1]-res[k];
        }
        
        return res;
    }
    
    public MatrizTripletas transpuesta(){
        System.out.println("transpuesta");
        MatrizTripletas respuesta = null;
        
        Tripleta primera = this.Mat.get(0);
        respuesta = new MatrizTripletas(primera);
        
        int[] vectorLimites = contruyeVectorDeLimitesColumna();
        System.out.println("    construye transpuesta");
        int nTripletas = this.Mat.size();
        for (int i = 1; i < nTripletas; i++) {
            System.out.println("i:"+i);
            Tripleta tripleta = this.Mat.get(i);
            System.out.println("i: "+i+ " "+tripleta);
            int columna = tripleta.getColumna();
            respuesta.asignaTripleta(tripleta, vectorLimites[columna]);
            vectorLimites[columna]= vectorLimites[columna]+1;
        }
        
        return respuesta;
    
    }
    
    
    public int[][] revertir(){
        int[][] res = null;
        
        res = new int[nFilas][nColumnas];
        int contador = Mat.size();
        for (int i = 1; i < contador-1; i++) {
            Tripleta tripleta = Mat.get(i);
            
            if (tripleta != null) {
                System.out.println("revertir "+tripleta);
                int fila = tripleta.getFila();
                int columna = tripleta.getColumna();
                res[fila-1][columna-1] = tripleta.getValor();
            }
        }
        
        
        
        return res;
    
    }
    
    
    /**
     * Recorre la matriz original en busca de cuantos valores diferentes de cero
     * encuentra
     * @deprecated 
     * @param MatDispersaOriginal matriz dispersa original
     * @return 
     */
    public static int contarDatos(int[][] MatDispersaOriginal){
        int nTripletas = -1;
        
        if (MatDispersaOriginal != null) {
            int nFilas = MatDispersaOriginal.length;
            int nColumnas = MatDispersaOriginal[0].length;
            nTripletas = 0;
            
            int k = 1;            
            for (int i = 0; i < nFilas; i++) {
                for (int j = 0; j < nColumnas; j++) {
                    int val = MatDispersaOriginal[i][j];
                    if (val != 0) {
                        nTripletas++;
                    }
                }
                
            }
        }
        
        return nTripletas;
    }
    
    
    //TODO intercambiar filas
    
    //TODO multiplicar por un escalar
    
    //TODO determinante
    
    //TODO remplazar una fila
    
    
    //retornar una fila
    public List<Tripleta> getFila(int nFila){

        List<Tripleta> fila = null;
        
        if (nFila < this.nFilas) {
            
            fila = new ArrayList<Tripleta>();
            
            for (Tripleta tripleta : this.Mat) {
                if (tripleta.getFila() == nFila) {
                    fila.add(tripleta);
                }
            }
            
        }
        
        return fila;
        
    }
}
