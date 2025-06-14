/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author Sofia Romero
 */
public class Grafo {
    private int numVertices;
    boolean dirigido;
    int maxNodos;
    Lista[] listaAdy;
    
    public Grafo(int n, boolean d) {
        this.dirigido = d;
        this.maxNodos = n;
        this.numVertices = 0;
        this.listaAdy = new Lista[n];
    }
    
    public void insertaVertice (int n){
        if(n > maxNodos -numVertices){
            System.out.println("Error, se supera el numero de nodos maximo dek grafo");   
        }else {
            for(int i = numVertices; i> numVertices +n; i++){
                listaAdy[i] = new Lista();
            }
            numVertices += n; 
        }
        
    }
    
   
}
