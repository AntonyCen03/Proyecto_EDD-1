/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**

 * @author Antony Cen y Sofia Romero
 * @version 23/05/25
 */
public class Lista {
    public Nodo pFirst;
    public Nodo pLast;
    public int iN;
    
    /**
     * 
     * @param pFirst
     * @param pLast
     * @param iN 
     */
    public Lista(Nodo pFirst, Nodo pLast, int iN) {
        this.pFirst = null;
        this.pLast = null;
        this.iN = 0;
    }
    
    /**
     * Metodo Tamaño
     * @return retorna el tamaño de la lista
     */
    public int Tamano(){
        return this.iN;
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
    public Nodo  Primero(){
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
    public Object Leer(Nodo pValor){
        return pValor.dato;
    }
    
    /**
     * Metodo Proximo
     * @param pValor
     * @return Esto retorna el pNext al pValor
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
    
    /**
     * Metodo Insertar
     * @param x
     * @param pValor 
     */
    public void Insertar2 (String x, Nodo pValor){
        Nodo  pNew = new Nodo (x , pValor);
        if (this.EsVacia()) {
            this.pFirst=pNew;
            this.iN++; 
        }else{
            if (pValor!= this.Ultimo()) {
                pNew.pNext=pValor;
                pValor.pNext=pNew;
                this.iN++;
                
            }
        }
        
    }
    
    /**
     * Metodo Eliminar
     * Esto sirve para eliminar pValor de lista
     * @param pValor 
     */
    public void Eliminar(Nodo pValor) {
        Nodo p=null;
        if (pValor==pFirst) {
            pValor=pFirst;
            pFirst=pValor.pNext;
            
        }else{
            pValor=this.Primero();
            if (p.pNext!=pValor) {
                p=Proximo(p);   
            }
            p.pNext=pValor.pNext;
        }
        pValor=null;
        iN--;
    }
    
    public void Insertar(String x){
        pFirst = new Nodo(x, pFirst);
    }

    
}
