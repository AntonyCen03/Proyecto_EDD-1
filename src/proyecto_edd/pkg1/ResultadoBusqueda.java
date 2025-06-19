/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_edd.pkg1;

/**
 *
 * @author anton
 */
public class ResultadoBusqueda {
    private String palabra;
    private boolean encontrada;
    private long tiempo;
    
    public ResultadoBusqueda(String palabra, boolean encontrada, long tiempo) {
        this.palabra = palabra;
        this.encontrada = encontrada;
        this.tiempo = tiempo;
    }
    
    // Getters
    public String getPalabra() { return palabra; }
    public boolean isEncontrada() { return encontrada; }
    public long getTiempo() { return tiempo; }
    
    @Override
    public String toString() {
        return String.format("%s - %s - %d ms", 
                           palabra, 
                           encontrada ? "Encontrada" : "No encontrada", 
                           tiempo);
    }
}

