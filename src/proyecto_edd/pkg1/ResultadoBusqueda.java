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
    public String palabra;
    public boolean encontrada;
    public long tiempoMs;

    public ResultadoBusqueda(String palabra, boolean encontrada, long tiempoMs) {
        this.palabra = palabra;
        this.encontrada = encontrada;
        this.tiempoMs = tiempoMs;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s - %-5s - %3d ms", palabra, encontrada, tiempoMs);
    }
}
