/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.claseslogica3.matriz.tripletas;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sony vaio
 */
public class MatrizTripletasTest {
    
    public MatrizTripletasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testContructorNoNulo(){
        
        int[][] mock = matrizDispersa3x3();
        
        imprimeMatriz(mock);
    
        MatrizTripletas matriz = new MatrizTripletas(mock);
        
        matriz.imprimirConsola();
        
        assertNotNull(matriz);
        
    }
    
    @Test
    public void testConstruccionCorrecta(){
        int[][] mock = matrizDispersa3x3();
        imprimeMatriz(mock);
        MatrizTripletas matriz = new MatrizTripletas(mock);
        int[][] equivalente = matriz.revertir();
        
        matriz.imprimirConsola();
        imprimeMatriz(equivalente);
        assertArrayEquals(mock, equivalente);
        
    }
    
    @Test
    public void testConstruyeVectorLimitesFila(){
        int[][] mock = matrizDispersa3x3();
        imprimeMatriz(mock);
        MatrizTripletas matriz = new MatrizTripletas(mock);
        matriz.imprimirConsola();
        int[] vectorLimites = matriz.contruyeVectorDeLimitesFila();
        
        for (int i = 0; i < vectorLimites.length; i++) {
            int j = vectorLimites[i];
            System.out.println("fila"+i+" limite"+j);
        }
        
    }
    
    @Test
    public void testConstruyeVectorLimitesColumna(){
        int[][] mock = matrizDispersa3x3();
        imprimeMatriz(mock);
        MatrizTripletas matriz = new MatrizTripletas(mock);
        matriz.imprimirConsola();
        int[] vectorLimites = matriz.contruyeVectorDeLimitesColumna();
        
        for (int i = 0; i < vectorLimites.length; i++) {
            int j = vectorLimites[i];
            System.out.println("columna"+i+" limite"+j);
        }
        
    }
    
    @Test
    public void testTranspuesta(){
        int[][] mock = matrizDispersa3x3();
        imprimeMatriz(mock);
        MatrizTripletas matriz = new MatrizTripletas(mock);
        matriz.imprimirConsola();
        MatrizTripletas transversa = matriz.transpuesta();
        imprimeArraylist(matriz.Mat);
        imprimeArraylist(transversa.Mat);
        
        transversa.imprimirConsola();
        int[][] transpuesta = transversa.revertir();
        imprimeMatriz(transpuesta);
        
    
    }
    
    
    public static void imprimeArraylist(List<Tripleta> listaTripletas){
        int i = 0;
        for (Tripleta tripleta : listaTripletas) {
            System.out.println("i:"+i+++" "+tripleta);
        }
    
    }
    
    
    
    public static void imprimeMatriz(int[][] mat){
        int nFilas = mat.length;
        int nColumnas = mat[0].length;

         
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                int val = mat[i][j];
                System.out.print(val);
                System.out.print("\t");
            }
            System.out.println("");
        }
    
    }
    
    
    
    public static int[][] matrizDispersa3x3(){
        int[][] res = null;
    
        res = new int[3][3];
        res[0][0]=0;
        res[0][1]=1;
        res[0][2]=0;
        res[1][0]=2;
        res[1][1]=0;
        res[1][2]=3;
        res[2][0]=0;
        res[2][1]=4;
        res[2][2]=0;
        
        return res;
    }
    
}
