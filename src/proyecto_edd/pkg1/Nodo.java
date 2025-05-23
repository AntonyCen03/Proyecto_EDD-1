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
public class Nodo <T> {
    public Nodo <T> pNext;
    public Nodo <T> pPrev;
    public T dato;
    
    /**}
     * Apuntador y datos
     * @param dato 
     */
    public Nodo(T dato) {
        this.pNext = null;
        this.pPrev = null;
        this.dato = dato;
    }
    
    
}
