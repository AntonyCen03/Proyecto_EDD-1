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
    public String dato;

    public Nodo(String dato, Nodo pNext) {
        this.pNext = pNext;
        this.dato = dato;
    }
    
    
}
