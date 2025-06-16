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
    private int maxNodos;
    private boolean[][] aristas;
    
    public Grafo() {
        this.maxNodos = 16;
        this.aristas = new boolean[16][16];
    }
    
    public void insertarArista (){
        for (int fila = 0; fila< 4; fila++){
            for(int cola = 0;  cola <4; cola++){
            
                int actual = fila*4 + cola;
                // System.out.println(actual);
                for(int x = -1; x<= 1 ; x++){
                    for(int y = -1; y<= 1; y++){
                    
                        if (x== 0 && y== 0) continue;
                        
                        int nx = fila +x;
                        int ny = cola + y;
                        
                        if (nx >= 0 && nx< 4  && ny >= 0 && ny< 4){
                            int adyacente = nx *4 +ny;
                            
                            aristas[actual][adyacente]= true;
                            //System.out.println(aristas[actual][adyacente]);
                        }
                        
                    }
                }
            }
        }
        
    }
    
    public boolean is_Adyacente(){
           return false;
    
    }
    
    public void Palabras(String[] palabras){
        String[] tablero = null; // Tablero lineal 4*4
        int intentos = 0;
        int maxIntentos = 5000; // máximo de intentos para formar un tablero válido

        while (intentos < maxIntentos) {
            // Vaciar el tablero
            for (int i = 0; i < 16; i++) {
                tablero[i] = "*";
            }
        }
    }
    
    
    
}
    
   

