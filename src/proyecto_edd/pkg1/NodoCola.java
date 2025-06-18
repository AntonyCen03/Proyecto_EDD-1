/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author anton
 */
public class NodoCola {
    private Object dato;
    private int nodo;
    private int indice;
    private NodoCola pNext;

    public NodoCola(int nodo, int indice) {
        this.nodo = nodo;
        this.indice = indice;
        this.pNext = null;
    }


    public int getNodo() { return nodo; }
    public int getIndice() { return indice; }
    public NodoCola getpNext() { return pNext; }
    public void setpNext(NodoCola pNext) { this.pNext = pNext; }

    /**
     * @param nodo the nodo to set
     */
    public void setNodo(int nodo) {
        this.nodo = nodo;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
}
