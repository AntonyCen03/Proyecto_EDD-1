/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 * Clase Cola
 * @author Antony Cen y Sofia Romero
 * @version 14/06/2025
 */
public class Cola {
    private NodoCola Head;
    private NodoCola Tail;
    private int Size;
    
/**
 * Constructor Cola
 * @author Antony Cen y Sofia Romero
 */
    public Cola() {
        this.Head = null;
        this.Tail = null;
        this.Size = 0;
    }

 /**
 * Metodo EsVacio
 * @author Antony Cen y Sofia Romero
 * @return Cola vacio
 */
    public boolean EsVacio(){
        return getHead()==null;
    }
 
 /**
 * Metodo Vaciar
 * @author Antony Cen y Sofia Romero
 */
    public void Vaciar(){
        this.setHead(null);
        this.setTail(null);
        this.setSize(0);
    }

 /**
 * Metodo Desencolar
 * @author Antony Cen y Sofia Romero
 * 
 */    
    public void Desencolar(){
        if (this.EsVacio()) {
            System.out.println("La cola esta vacia");
        }else if (getSize()==1) {
            this.Vaciar();
        }else{
            setHead(getHead().getpNext());
            Size--;
        }
    }


 /**
 * Metodo Encolar
 * @author Antony Cen y Sofia Romero
 */    
    public void Encolar(NodoCola nuevo){
        if (this.EsVacio()) {
            Head=Tail=nuevo;
        }else{
            Tail.setpNext(nuevo);
            Tail=nuevo;
        }
        Size++;
    }

 /**
 * Metodo Imprimir
 * @author Antony Cen y Sofia Romero
 * @return String
 */    
    public String print(){
        if (!this.EsVacio()) {
            String printCola="";
            NodoCola actual=Head;
            while(actual != null){
                
                printCola += actual.getDato()+",";
                actual = actual.getpNext();
            }
            return printCola;
        }
        return null;
    }

    /**
     * @return the Head
     */
    public NodoCola getHead() {
        return Head;
    }

    /**
     * @param Head the Head to set
     */
    public void setHead(NodoCola Head) {
        this.Head = Head;
    }

    /**
     * @return the Tail
     */
    public NodoCola getTail() {
        return Tail;
    }

    /**
     * @param Tail the Tail to set
     */
    public void setTail(NodoCola Tail) {
        this.Tail = Tail;
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



