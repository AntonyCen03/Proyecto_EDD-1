/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 * Clase Lista  
 * @author Antony Cen y Sofia Romero
 * @version 23/05/25
 */
public class Lista {
    public Nodo pFirst;
    public Nodo pLast;
    
    /**
     * 
     * @param pFirst
     * @param pLast 
     */
    public Lista(Nodo pFirst, Nodo pLast) {
        this.pFirst = null;
        this.pLast = null;
    }
    /**
     * Metodo EsVacia
     * @return Esto retorna si la lista es vacia si pFirst es vacia.
     */
    public boolean EsVacia(){
        return this.pFirst==null;
    }
    
    /**
     * Metodo Primero
     * @return Esto retorna el primero de la lista
     */
    public Nodo Primero(){
        return this.pFirst;
    }
    
    /**
     * Metodo Ultimo
     * @return Esto retorna el Ultimo de la lista 
     */
    public Nodo Ultimo(){
        return this.pLast;
    }
    
    /**
     * Metodo Leer
     * @param pValor
     * @return retorna los que leer a pValor
     */
    public String Leer(Nodo pValor){
        return pValor.dato;
    }
    
    /**
     * Metodo Proximo
     * @param pValor
     * @return Esto retorna el pNext al pevalor
     */
    public Nodo Proximo(Nodo pValor){
        if (pValor!=this.Ultimo()) {
            return pValor.pNext;
        }else{
            return this.Ultimo();
        }
    }
    
    /**
     * Metodo Final
     * @return retornar el final de la lista 
     */
    public Nodo Final(){
        if (this.EsVacia()) {
            return null;
        }else{
            Nodo pAux=this.Primero();
            while (pAux.pNext!=this.Ultimo()){
                pAux=this.Proximo(pAux);
            }
            return pAux;
        }
    }
    
    /**
     * Motodo Recorrer
     * @return Retorna el valor que busca
     */
    public String Recoorer(){
        Nodo pAux;
        String resultado="";
        if (this.EsVacia()) {
            return "La lista esta vacia";
          
        }else{
            pAux=this.Primero();
            while (pAux!=this.Ultimo()){
                resultado=resultado+this.Leer(pAux)+"   ";
                pAux=this.Primero();
            }
        }
        return resultado;
    }
    
    
}
