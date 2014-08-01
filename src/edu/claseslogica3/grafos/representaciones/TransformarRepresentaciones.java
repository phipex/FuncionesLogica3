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
public class TransformarRepresentaciones {

    public static void llamaMatrizAdya2ListaAdya() {

        MatrizAdyacencia mat = new MatrizAdyacencia();
        mat.pintaMatriz();

        ListaLigadaAdyacencia lista = MatrizAdya2ListaAdya(mat);
        lista.pintaGrafo();

    }

    public static ListaLigadaAdyacencia MatrizAdya2ListaAdya(MatrizAdyacencia matrizAdya) {
        //TODO verificar que la matriz no sea nula

        ListaLigadaAdyacencia lista = null;
        NodoSimple nodo = null;
        int[][] adya = matrizAdya.adya;
        lista = new ListaLigadaAdyacencia(adya.length);
        for (int i = 0; i < adya.length; i++) {
            for (int j = adya.length -1 ; j >= 0 ; j--) {
                int is = adya[i][j];
                System.out.println("is["+(i+1)+"]["+(j+1)+"]: "+is);
                if(is == 1){
                    nodo = new NodoSimple(j+1);
                    
                    nodo.liga = lista.vec.get(i).liga;
                    lista.vec.get(i).liga = nodo;
                    System.out.println("vertice: "+(i+1)+" nodo: "+nodo.dato);
                }
                
            }
            
        }

        return lista;
    }

    public static void llamaMatrizAdya2MultilistaAdya() {

        MatrizAdyacencia mat = new MatrizAdyacencia();
        mat.pintaMatriz();

        MultilistaAdyacencias lista = MatrizAdya2MultilistaAdya(mat);
        lista.pintaGrafo();

    }

    private static MultilistaAdyacencias MatrizAdya2MultilistaAdya(MatrizAdyacencia matrizAdya) {
        MultilistaAdyacencias multilista = null;
        
        NodoMultiAdya nodo = null;
        int[][] adya = matrizAdya.adya;
        multilista = new MultilistaAdyacencias(adya.length);
        //for (int i = adya.length -1; i >= 0 ; i--) {
        for (int i = 0; i < adya.length; i++) {
            System.out.println("i:"+i);
            //for (int j = adya.length -1 ; j >= i+1 ; j--) {
            for (int j = i +1 ; j < adya.length ; j++) {    
                System.out.println("is["+(i+1)+"]["+(j+1)+"]: ");
                int is = adya[i][j];
                System.out.println("is["+(i+1)+"]["+(j+1)+"]: "+is);
                if(is == 1){
                    nodo = new NodoMultiAdya((i+1), (j+1));
                    nodo.ligaVi = multilista.vec.get(i);
                    multilista.vec.set(i, nodo);
                    nodo.ligaVj = multilista.vec.get(j);
                    multilista.vec.set(j, nodo);
                    multilista.auxiliar.add(nodo);
                }
                
            }
            
        }
        
        
        
        return multilista;
    }
    
    public static void llamaMatrizAdya2MatrizInci() {

        MatrizAdyacencia mat = new MatrizAdyacencia();
        mat.pintaMatriz();

        MatrizIncidencia lista = MatrizAdya2MatrizInci(mat);
        lista.pintaMatriz();

    }
    
    
    public static MatrizIncidencia MatrizAdya2MatrizInci(MatrizAdyacencia matrizAdya){
        MatrizIncidencia inci = null;
        
        int[][] adya = matrizAdya.adya;
        inci = new MatrizIncidencia(adya.length,matrizAdya.numeroLados());
        //for (int i = adya.length -1; i >= 0 ; i--) {
        int k = 0;//numero de lados
        for (int i = 0; i < adya.length; i++) {
            //System.out.println("i:"+i);
            //for (int j = adya.length -1 ; j >= i+1 ; j--) {
            for (int j = i ; j < adya.length ; j++) {    
                //System.out.println("is["+(i+1)+"]["+(j+1)+"]: ");
                int is = adya[i][j];
                System.out.println("is["+(i+1)+"]["+(j+1)+"]: "+is);
                if(is == 1){
                    inci.inci[i][k]=1;
                    inci.inci[j][k]=1;
                    k++;
                }
                
            }
            
        }
        
        return inci;
    
    }
    
    public static void llamaMatrizInci2MatrizAdya() {

        MatrizAdyacencia mat = new MatrizAdyacencia();
        mat.pintaMatriz();

        MatrizIncidencia incidencia = MatrizAdya2MatrizInci(mat);
        incidencia.pintaMatriz();
        
        MatrizAdyacencia adyacencia = MatrizInci2MatrizAdya(incidencia);
        adyacencia.pintaMatriz();
        

    }

    private static MatrizAdyacencia MatrizInci2MatrizAdya(MatrizIncidencia incidencia) {
        
        MatrizAdyacencia adya = null;
        
        int[][] inci = incidencia.inci;
        
        adya = new MatrizAdyacencia(incidencia.numeroVertices);
        
        for (int i = 0; i < incidencia.numeroLados; i++) {
            int vertice = -1;
            for (int j = 0; j < incidencia.numeroVertices; j++) {
                int is = inci[j][i];
                System.out.println("is["+(j+1)+"]["+(i+1)+"]: "+is+ " vertice:"+vertice);
                if(is == 1){
                    if(vertice == -1){
                        vertice = j;
                    }else{
                        System.out.println("["+(vertice+1)+"]["+(j+1)+"]["+(j+1)+"]["+(vertice+1)+"]");
                        adya.adya[vertice][j] = 1;
                        adya.adya[j][vertice] = 1;
                        
                    }
                    
                    
                }
                
            }
            System.out.println("---------------------");
            
        }
        
        return adya;
    }
    
}
