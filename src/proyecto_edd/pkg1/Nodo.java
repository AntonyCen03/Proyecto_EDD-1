/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author Antony Cen
 */
public class Nodo {
    public Nodo pNext;
    public Nodo pPrev;
    public String dato;

    public Nodo(Nodo pNext, String dato) {
        this.pNext = null;
        this.pPrev = null;
        this.dato = dato;
    }
    
}
