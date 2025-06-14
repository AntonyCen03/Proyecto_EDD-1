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
    private NodoCola pNext;

    public NodoCola(Object dato) {
        this.dato = dato;
        this.pNext = null;
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

    /**
     * @return the pNext
     */
    public NodoCola getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoCola pNext) {
        this.pNext = pNext;
    }
    
    
}
