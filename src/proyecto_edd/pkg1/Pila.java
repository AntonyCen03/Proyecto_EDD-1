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
     * Metodo Apilar
     */
    public void Apilar(Object dato){
        NodoPila nuevo=new NodoPila(dato);
        if (EsVacio()) {
            pIni=nuevo;
        }else{
            NodoPila aux=getpIni();
            nuevo.setDato(aux);
            pIni=nuevo;
        }
    }
    
    /**
     * Metodo Desapilar
     */
    public void Desapilar(){
        if (! EsVacio()) {
            pIni.getpNext();
            Size--;
        }
    }
    
    
    /**
     * Metodo de Imprimir
     * @return the Print
     */
    public String Print(){
        String texto;
        texto="";
        if (! EsVacio()) {
            NodoPila aux=pIni;
            for (int i = 0; i < getSize(); i++) {
                texto=aux.getDato()+",";
                aux=aux.getpNext();
            }
        }else{
            texto="La píla esta vacio";
        }
        return texto;
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
