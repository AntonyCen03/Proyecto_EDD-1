/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author Sofia Romero
 */
public class NodoCola {
    private int nodo;
    private int indice;
    private boolean[] visitados;
    private NodoCola pNext;
    
    public NodoCola(int nodo, int indice, boolean[] visitados){
        this.nodo = nodo;
        this.indice = indice;
        this.visitados = visitados;
    }
    
    public int getNodo(){
        return nodo;
    }
    
    public int getIndice(){
        return indice;
        
    }
    
    public boolean[] getVisitados(){
        return visitados;
    }
    
     public NodoCola getpNext() {
        return pNext;
    }

    public void setpNext(NodoCola pNext) {
        this.pNext = pNext;}
    
    public String getDato() {
        return "(" + nodo + ", " + indice + ")";
    }
    
}
