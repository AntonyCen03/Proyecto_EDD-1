/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

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
     * Mide el tiempo de búsqueda para un conjunto de palabras
     * @param palabras Arreglo de palabras a buscar
     * @param tablero Tablero de letras
     * @return Lista con los resultados
     */
    public Lista medirBusqueda(String[] palabras, String[] tablero) {
        Lista resultados = new Lista(null, null, 0);
        long inicioTotal = System.currentTimeMillis();
        
        for (String palabra : palabras) {
            long inicio = System.currentTimeMillis();
            boolean encontrada = grafo.buscarPalabraDFS(palabra, tablero);
            long tiempo = System.currentTimeMillis() - inicio;
            
            ResultadoBusqueda res = new ResultadoBusqueda(palabra, encontrada, tiempo);
            resultados.Insertar(res.toString());
        }
        
        long tiempoTotal = System.currentTimeMillis() - inicioTotal;
        String resumen = crearResumen(palabras.length, tiempoTotal);
        resultados.Insertar(resumen);
        
        return resultados;
    }
    
    private String crearResumen(int totalPalabras, long tiempoTotal) {
        double promedio = (double) tiempoTotal / totalPalabras;
        return String.format("\nRESUMEN: %d palabras - %d ms - Promedio: %.2f ms",
                           totalPalabras, tiempoTotal, promedio);
    }
    
    /**
     * Muestra los resultados por consola
     * @param resultados Lista con los resultados
     */
    public void mostrarResultados(Lista resultados) {
        System.out.println("Resultados de búsqueda:");
        System.out.println("Palabra     - Encont. - Tiempo");
        System.out.println("-------------------------------");
        
        Nodo actual = resultados.Primero();
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.pNext;
        }
    }
}
