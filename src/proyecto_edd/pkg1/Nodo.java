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
    public int dato;

    public Nodo(int dato, Nodo pNext) {
        this.pNext = pNext;
        this.dato = dato;
    }
    
}
