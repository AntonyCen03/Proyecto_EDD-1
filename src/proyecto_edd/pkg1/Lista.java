/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author anton
 */
public class Lista {
    public Nodo pFirst;
    public Nodo pLast;

    public Lista(Nodo pFirst, Nodo pLast) {
        this.pFirst = null;
        this.pLast = null;
    }
    
    public boolean EsVacia(){
        return this.pFirst==null;
    }
    
    public Nodo Primero(){
        return this.pFirst;
    }
    
    public Nodo Ultimo(){
        return this.pLast;
    }
    
    public String Leer(Nodo pValor){
        return pValor.dato;
    }
    
    public Nodo Proximo(Nodo pValor){
        if (pValor!=this.Ultimo()) {
            return pValor.pNext;
        }else{
            return this.Ultimo();
        }
    }
    
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
