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
        System.out.println("testConstruyeVectorLimitesFila");
        int[][] mock = matrizDispersa3x3();
        imprimeMatriz(mock);
        MatrizTripletas matriz = new MatrizTripletas(mock);
        matriz.imprimirConsola();
        int[] vectorLimites = matriz.contruyeVectorDeLimitesFila();
        //TODO construir fila de respuesta 
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
        //TODO costruir fila de respuesta
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
        //TODO construir transpuesta para comparar
    
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

    /**
     * Test of asignaTripleta method, of class MatrizTripletas.
     */
    @Test
    public void testAsignaTripleta() {
        System.out.println("asignaTripleta");
        Tripleta tripleta = null;
        int posicion = 0;
        MatrizTripletas instance = null;
        instance.asignaTripleta(tripleta, posicion);
        // TODO construir matriz para comparar
        fail("The test case is a prototype.");
    }

    /**
     * Test of retornNumeroTripletas method, of class MatrizTripletas.
     */
    @Test
    public void testRetornNumeroTripletas() {
        System.out.println("retornNumeroTripletas");
        MatrizTripletas instance = null;
        int expResult = 0;
        int result = instance.retornNumeroTripletas();
        assertEquals(expResult, result);
        // TODO corregir este metodo para que use mock
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of contruyeVectorDeLimitesFila method, of class MatrizTripletas.
     */
    @Test
    public void testContruyeVectorDeLimitesFila() {
        System.out.println("contruyeVectorDeLimitesFila");
        MatrizTripletas instance = null;
        int[] expResult = null;
        int[] result = instance.contruyeVectorDeLimitesFila();
        assertArrayEquals(expResult, result);
        // TODO construir array con los datos esperados
        fail("The test case is a prototype.");
    }

    /**
     * Test of contruyeVectorDeLimitesColumna method, of class MatrizTripletas.
     */
    @Test
    public void testContruyeVectorDeLimitesColumna() {
        System.out.println("contruyeVectorDeLimitesColumna");
        MatrizTripletas instance = null;
        int[] expResult = null;
        int[] result = instance.contruyeVectorDeLimitesColumna();
        assertArrayEquals(expResult, result);
        // TODO construir array con los datos esperados
        fail("The test case is a prototype.");
    }

    /**
     * Test of revertir method, of class MatrizTripletas.
     */
    @Test
    public void testRevertir() {
        System.out.println("revertir");
        MatrizTripletas instance = null;
        int[][] expResult = null;
        int[][] result = instance.revertir();
        assertArrayEquals(expResult, result);
        // TODO construir matriz para comparar
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarDatos method, of class MatrizTripletas.
     */
    @Test
    public void testContarDatos() {
        System.out.println("contarDatos");
        int[][] MatDispersaOriginal = null;
        int expResult = 0;
        int result = MatrizTripletas.contarDatos(MatDispersaOriginal);
        assertEquals(expResult, result);
        // TODO corregir este metodo
        fail("The test case is a prototype.");
    }

    /**
     * Test of intercambiaFilas method, of class MatrizTripletas.
     */
    @Test
    public void testIntercambiaFilas() {
        System.out.println("intercambiaFilas");
        int i = 0;
        int j = 0;
        MatrizTripletas instance = null;
        instance.intercambiaFilas(i, j);
        // TODO contruir matriz con la fila intercambiada para comparar
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicaEscalar method, of class MatrizTripletas.
     */
    @Test
    public void testMultiplicaEscalar() {
        System.out.println("multiplicaEscalar");
        int escalar = 0;
        MatrizTripletas instance = null;
        instance.multiplicaEscalar(escalar);
        // TODO contruir matriz con la fila multiplicada para comparar
        fail("The test case is a prototype.");
    }

    /**
     * Test of determinante method, of class MatrizTripletas.
     */
    @Test
    public void testDeterminante() {
        System.out.println("determinante");
        MatrizTripletas instance = null;
        int expResult = 0;
        int result = instance.determinante();
        assertEquals(expResult, result);
        // TODO determinar el determinante
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaFila method, of class MatrizTripletas.
     */
    @Test
    public void testReemplazaFila() {
        System.out.println("reemplazaFila");
        int[] filaNueva = null;
        MatrizTripletas instance = null;
        instance.reemplazaFila(filaNueva);
        // TODO crear la matriz con la fila reemplazada 
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicaxEscalar method, of class MatrizTripletas.
     */
    @Test
    public void testMultiplicaxEscalar() {
        System.out.println("multiplicaxEscalar");
        int escalar = 0;
        MatrizTripletas instance = null;
        instance.multiplicaxEscalar(escalar);
        // TODO crear la matriz con la fila multiplicada
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFila method, of class MatrizTripletas.
     */
    @Test
    public void testGetFila() {
        System.out.println("getFila");
        int nFila = 0;
        MatrizTripletas instance = null;
        List<Tripleta> expResult = null;
        List<Tripleta> result = instance.getFila(nFila);
        assertEquals(expResult, result);
        // TODO crear la tripleta a evaluar
        fail("The test case is a prototype.");
    }
    
}
