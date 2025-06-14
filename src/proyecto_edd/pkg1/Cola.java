/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author anton
 */
public class Cola {
    private NodoCola Head;
    private NodoCola Tail;
    private int Size;

    public Cola() {
        this.Head = null;
        this.Tail = null;
        this.Size = 0;
    }
    
    public boolean EsVacio(){
        return getHead()==null;
    }
    
    public void Vaciar(){
        this.setHead(null);
        this.setTail(null);
        this.setSize(0);
    }
    
    public void Desencolar(){
        if (this.EsVacio()) {
            System.out.println("La cola esta vacia");
        }else if (getSize()==1) {
            this.Vaciar();
        }else{
            setHead(getHead().getpNext());
        }
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
