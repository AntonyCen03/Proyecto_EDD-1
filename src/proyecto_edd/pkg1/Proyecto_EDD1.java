/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 * Main
 * @author Antony Cen y Sofia Romero
 * @version 23/05/25
 */
public class Proyecto_EDD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo jj = new Grafo();
        jj.insertarArista();
        Interfaz ventana1 = new Interfaz(jj);
        ventana1.setVisible(true);
        ventana1.setLocationRelativeTo(null);

        
//        boolean[] visitados = new boolean [16];
//        System.out.println ("recorrido dfs recursivo desde el nodo 0");
//        jj.DFS(0, visitados);
//   


        
    }
    
}
