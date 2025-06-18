/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author anton
 */
public class NodoPilaDFS {
    private int nodo;
    private int indice;

    public NodoPilaDFS(int nodo, int indice) {
        this.nodo = nodo;
        this.indice = indice;
    }
    
    public int getNodo(){
        return nodo;
    }
    
    public int getIndice(){
        return indice;
    }
}
