/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 * Clase Nodo
 * @author Antony Cen y Sofia Romero
 * @version 23/05/25
 */
public class Nodo {
    public Nodo pNext;
    public Nodo pPrev;
    public String dato;
    
    /**}
     * Apuntador y datos
     * @param pNext
     * @param pPrev
     * @param dato 
     */
    public Nodo(Nodo pNext, Nodo pPrev, String dato) {
        this.pNext = null;
        this.pPrev = null;
        this.dato = dato;
    }
    
    
}
