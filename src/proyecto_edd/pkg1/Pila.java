/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 * Clase Pila
 * @author Antony Cen
 * @version 12/06/2025
 */
public class Pila {
    private NodoPila pIni;
    private int Size;
    
    public Pila() {
        this.pIni = null;
        this.Size = 0;
    }
    
    /**
     * @return the pIni==null
     */
    public boolean EsVacio(){
        return pIni==null;
    }
    
    /**
     * @return the Size
     */
    public int Tamaño(){
        return Size;
    }
    
    /**
     * @return the pIni.getDato
     */
    public Object LeerCabezar(){
        return pIni.getDato();
    }
    
    /**
     * Método Apilar corregido
     */
    public void Apilar(Object dato) {
        NodoPila nuevo = new NodoPila(dato);
        if (EsVacio()) {
            pIni = nuevo;
        } else {
            nuevo.setpNext(pIni);  
            pIni = nuevo;
        }
        Size++;  
    }
    
     /**
     * Método Desapilar corregido
     */
    public void Desapilar() {
        if (!EsVacio()) {
            pIni = pIni.getpNext(); 
            Size--;
        }
    }
    
    
    /**
     * Método Print corregido
     */
    public String Print() {
        StringBuilder texto = new StringBuilder();
        if (!EsVacio()) {
            NodoPila aux = pIni;
            while (aux != null) {  // Mejor usar while que for con tamaño
                texto.append(aux.getDato()).append(",");
                aux = aux.getpNext();
            }
            // Eliminar la última coma si hay elementos
            if (texto.length() > 0) {
                texto.setLength(texto.length() - 1);
            }
        } else {
            texto.append("La pila está vacía");
        }
        return texto.toString();
    }  

    /**
     * @return the pIni
     */
    public NodoPila getpIni() {
        return pIni;
    }

    /**
     * @param pIni the pIni to set
     */
    public void setpIni(NodoPila pIni) {
        this.pIni = pIni;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }
    
    
    
}
