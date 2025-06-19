/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class MedidorTiempoBusqueda {
    private Grafo grafo;
    
    public MedidorTiempoBusqueda(Grafo grafo) {
        this.grafo = grafo;
    }
    
    /**
     * Mide el tiempo de búsqueda para una palabra específica
     * @param palabra Palabra a buscar
     * @param tablero Tablero de letras
     * @return Resultado con el tiempo de búsqueda
     */
    public ResultadoBusqueda medirBusquedaIndividual(String palabra, String[] tablero, String metodo) {
        long inicio = System.currentTimeMillis();
        boolean encontrada;
        
        if(metodo.equals("DFS")) {
            encontrada = grafo.buscarPalabraDFS(palabra, tablero);
        } else {
            encontrada = grafo.buscarPalabraBFS(palabra, tablero);
        }
        
        long tiempo = System.currentTimeMillis() - inicio;
        return new ResultadoBusqueda(palabra, encontrada, tiempo);
    }
    
    /**
     * Muestra el resultado de búsqueda en un JOptionPane
     * @param resultado El resultado a mostrar
     */
    public void mostrarResultadoIndividual(ResultadoBusqueda resultado) {
        String mensaje = String.format("Palabra: %s\nEncontrada: %s\nTiempo: %d ms",
                                     resultado.getPalabra(),
                                     resultado.isEncontrada() ? "Sí" : "No",
                                     resultado.getTiempo());
        JOptionPane.showMessageDialog(null, mensaje, "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
    }
}
