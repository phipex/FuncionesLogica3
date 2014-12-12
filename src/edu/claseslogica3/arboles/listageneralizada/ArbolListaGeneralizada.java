package edu.claseslogica3.arboles.listageneralizada;

import edu.claseslogica3.listaligadageneralizada.NodoLista;
import java.util.Stack;

/**
 * Clase que representa un arbol n-ario el cual esta representado como lista
 * ligada generalizada
 *
 * @author Andres Felipe Montoya
 * @param <T>
 */
public class ArbolListaGeneralizada<T> {

    public NodoLista<T> raiz = null;

    /**
     * Agrega un nuevo nodo al arbol
     *
     * @param padre nodo al que se le debe agregar como hijo un nodo con el dato
     * en el parametro
     * @param dato nodo con el dato a agregar
     * @return apuntador al nuevo nodo en el arbol o null si el padre no esta
     * contenido en el arbol
     */
    public NodoLista agregar(NodoLista<T> padre, NodoLista<T> dato) {
        NodoLista<T> nuevo = null;

        //si dato es igual a null nada
        if (dato != null) {
            if (this.raiz == null || padre != null) {
                if (padre == null) {//primer nodo del arbol
                    padre = dato;
                } else {
                    NodoLista<T> p = null;
                    p = padre;

                    while (p != null && p.liga != null) {
                        p = p.liga;
                    }
                    p.liga = dato;

                }
                if (this.raiz == null) {
                    this.raiz = padre;
                }
                nuevo = dato;
            }

        }

        return nuevo;
    }

    /**
     * Elimina la primera ocurrencia de un nodo con un dato igual al parametro
     *
     * @param dato dato a buscar para eliminar
     * @return true en caso de encontrar el dato o false en caso de no
     * encontrarlo
     */
    public boolean elimina(T dato) {

        boolean confirmado = false;

        return confirmado;

    }

    /**
     * Mueve el nodo para que sea el nuevo hijo del nodo padre en el parametro
     *
     * @param nodo nodo a mover
     * @param nuevoPadre nuevo nodo padre
     * @return true en caso de encontrar el dato o false en caso de no
     * encontrarlo
     */
    public boolean mover(NodoLista<T> nodo, NodoLista<T> nuevoPadre) {
        boolean confirmado = false;

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        //return confirmado;
    }

    /**
     * Busca un nodo cuyo dato sea igual al del parametro y retorna su primera
     * ocurrencia, si es un subarbol, retorna el apuntador
     *
     * @param dato dato a buscar
     * @return el nodo cuyo dato sea igual al del parametro o null en caso de no
     * encontrarlo
     */
    public NodoLista<T> buscar(T dato) {

        NodoLista<T> nodo = null;

        if (this.raiz != null) {
            int n = 0;
            
            T c;
            
            NodoLista p, q;
            
            Stack<NodoLista> pila = new Stack<NodoLista>();
            
            p = this.raiz;
            
            if (p.compareTo(dato) == 0) {
                
                return p;
            }
            
            pila.push(p);
            p = p.liga;
            while (p != null) {
                if (!p.sw) {
                    if (p.compareTo(dato) == 0) {
                        
                        return p;
                        
                    }
                    p = p.liga;
                } else {
                    q = p.subarbol;
                    if (q.compareTo(dato) == 0) {
                        return p;
                    } else {
                        pila.push(p.liga);
                        pila.push(q);
                        p = q.liga;
                    }
                }
                while (p == null && !pila.isEmpty()) {
                    p = pila.pop();
                }
            }
        }
        
        return nodo;
    }

    /**
     * Retorna el nodo correspondiente al padre del la primera ocurrencia al
     * buscar un nodo con el dato en el parametro
     *
     * @param dato dato buscar
     * @return nodo del padre o null en caso de no encontrarlo
     */
    public NodoLista<T> retornPadre(T dato) {
        NodoLista<T> padre = null;

        if (this.raiz != null) {
            int n = 0;
            
            T c;
            
            NodoLista p, q;
            
            Stack<NodoLista> pila = new Stack<NodoLista>();
            
            p = this.raiz;
            
            if (p.compareTo(dato) == 0) {
                padre = this.raiz;
                return padre;
            }
            
            pila.push(p);
            p = p.liga;
            while (p != null) {
                if (!p.sw) {
                    if (p.compareTo(dato) == 0) {
                        padre = pila.pop();
                        return padre;
                    }
                    p = p.liga;
                } else {
                    q = p.subarbol;
                    if (q.compareTo(dato) == 0) {
                        padre = pila.pop();
                        return padre;
                    } else {
                        pila.push(p.liga);
                        pila.push(q);
                        p = q.liga;
                    }
                }
                while (p == null && !pila.isEmpty()) {
                    p = pila.pop();
                }
            }
        }

        return padre;

    }

    /**
     * Retorna el nodo correpondiente al padre del nodo ingresado como parametro
     *
     * @param nodo nodo a buscar
     * @return nodo del padre o null en caso de no encontrarlo
     */
    public NodoLista<T> retornPadre(NodoLista<T> nodo) {
        NodoLista<T> padre = null;

        if (this.raiz != null) {
            int n = 0;
            
            T c;
            
            NodoLista p, q;
            
            Stack<NodoLista> pila = new Stack<NodoLista>();
            
            p = this.raiz;
            
            if (p == nodo) {
                padre = this.raiz;
                return padre;
            }
            
            pila.push(p);
            p = p.liga;
            while (p != null) {
                if (!p.sw) {
                    if (p == nodo) {
                        padre = pila.pop();
                        return padre;
                    }
                    p = p.liga;
                } else {
                    q = p.subarbol;
                    if (p == nodo) {
                        padre = pila.pop();
                        return padre;
                    } else {
                        pila.push(p.liga);
                        pila.push(q);
                        p = q.liga;
                    }
                }
                while (p == null && !pila.isEmpty()) {
                    p = pila.pop();
                }
            }
        }
        
        return padre;
    }

    /**
     * Determina si el nodo es la raiz de un subarbol y retorna el nodo que lo
     * apunta
     *
     * @param nodo nodo a evaluar
     * @return el nodo que apunta o null
     */
    public NodoLista esSubArbol(NodoLista nodo) {

        NodoLista esPadre = null;

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return esPadre;

    }

    @Override
    public String toString() {
        String name = "ArbolListaGeneralizada{" + "raiz=" + raiz + '}';
        System.out.println(""+name);
        if (this.raiz != null) {
            int n = 0;
            
            T c;
            
            NodoLista p, q;
            
            Stack<NodoLista> pila = new Stack<NodoLista>();
            
            p = this.raiz;
            
            System.out.println("raiz:"+p.dato);
            
            pila.push(p);
            p = p.liga;
            n++;
            while (p != null) {
                if (!p.sw) {
                    
                    System.out.println(espacios(n)+p.dato);
                    p = p.liga;
                } else {
                    q = p.subarbol;
                    System.out.println(espacios(n)+p.dato);
                    {
                        pila.push(p.liga);
                        pila.push(q);
                        p = q.liga;
                        n++;
                        n++;
                    }
                }
                while (p == null && !pila.isEmpty()) {
                    p = pila.pop();
                    n--;
                }
            }
        }
        System.out.println("fin arbol tostring");
        return name;
    }

    public static String espacios(int n){
    
        String espacio = "  ";
        for (int i = 0; i < n; i++) {
            espacio = espacio + "  ";
        }
        return espacio;
    }
    
}
