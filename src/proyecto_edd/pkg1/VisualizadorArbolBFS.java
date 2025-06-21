/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.swing_viewer.SwingViewer;
import org.graphstream.ui.view.View;
import javax.swing.*;
import org.graphstream.ui.view.Viewer;

/**
* Clase VisualizadorArbolBFS
* @author Antony Cen
* @version 20/06/2025
*/
public class VisualizadorArbolBFS {

    public static void mostrarArbol(Grafo grafo, String[] listaLetras, String palabra) {
        System.setProperty("org.graphstream.ui", "swing");
        Graph arbol = new SingleGraph("Árbol BFS - " + palabra);
        
        // Configuración visual mejorada
        arbol.setAttribute("ui.stylesheet", 
            "node { size: 30px; text-size: 14; fill-color: #3498db; }" +
            "node.raiz { fill-color: #e74c3c; size: 35px; }" +
            "node.palabra { fill-color: #2ecc71; }" +
            "edge { fill-color: #95a5a6; }");

        char primeraLetra = palabra.charAt(0);
        boolean[] visitados = new boolean[16];
        Cola cola = new Cola();

        // Encontrar y marcar todas las raíces posibles
        for (int i = 0; i < listaLetras.length; i++) {
            if (listaLetras[i].charAt(0) == primeraLetra) {
                Node raiz = arbol.addNode(String.valueOf(i));
                raiz.setAttribute("ui.label", listaLetras[i]);
                raiz.setAttribute("ui.class", "raiz");
                cola.Encolar(new NodoCola(i, 0, null));
                visitados[i] = true;
            }
        }

        // Recorrido BFS completo
        while (!cola.EsVacio()) {
            NodoCola actual = cola.getHead();
            cola.Desencolar();

            for (int vecino = 0; vecino < 16; vecino++) {
                if (grafo.getAristas()[actual.getNodo()][vecino]) {
                    if (!visitados[vecino]) {
                        visitados[vecino] = true;
                        cola.Encolar(new NodoCola(vecino, 0, null));
                        
                        Node nodo = arbol.addNode(String.valueOf(vecino));
                        nodo.setAttribute("ui.label", listaLetras[vecino]);
                        
                        // Resaltar letras de la palabra buscada
                        if (palabra.contains(listaLetras[vecino])) {
                            nodo.setAttribute("ui.class", "palabra");
                        }
                    }
                    
                    // Añadir conexión
                    try {
                        arbol.addEdge(
                            actual.getNodo()+"-"+vecino,
                            String.valueOf(actual.getNodo()),
                            String.valueOf(vecino)
                        );
                    } catch (Exception e) { /* Evitar duplicados */ }
                }
            }
        }

        // Mostrar ventana
        SwingViewer viewer = new SwingViewer(arbol, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
        viewer.enableAutoLayout();
        View vista = viewer.addDefaultView(false);
        
        JFrame frame = new JFrame("Árbol BFS: " + palabra);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add((JPanel) vista);
        frame.pack();
        frame.setSize(900, 650);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}