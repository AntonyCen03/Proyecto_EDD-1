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
    
        /**
     * Busca una palabra en el tablero usando DFS (Depth-First Search) con tu clase Pila
     * @param palabra La palabra a buscar
     * @param listaLetras El tablero de letras (4x4 linealizado)
     * @return true si la palabra existe, false en caso contrario
     */
    public boolean buscarPalabraDFS(String palabra, String[] listaLetras) {
        // Verificar entrada
        if (palabra == null || palabra.isEmpty() || listaLetras == null || listaLetras.length != 16) {
            return false;
        }

        for (int i = 0; i < 16; i++) {
            if (listaLetras[i].charAt(0) == palabra.charAt(0)) {
                Pila pila = new Pila();
                boolean[] visitados = new boolean[16];
                pila.Apilar(new NodoPilaDFS(i, 0));

                while (!pila.EsVacio()) {
                    NodoPilaDFS actual = (NodoPilaDFS) pila.LeerCabezar();
                    pila.Desapilar();

                    // Si encontramos la palabra completa
                    if (actual.getIndice() == palabra.length()) {
                        return true;
                    }

                    // Si la letra actual no coincide
                    if (listaLetras[actual.getNodo()].charAt(0) != palabra.charAt(actual.getIndice())) {
                        continue;
                    }

                    // Backtracking: marcamos como no visitado para permitir otros caminos
                    visitados[actual.getNodo()] = false;

                    // Explorar nodos adyacentes en orden inverso (para procesar en orden correcto)
                    for (int j = 15; j >= 0; j--) {
                        if (aristas[actual.getNodo()][j] && !visitados[j]) {
                            visitados[j] = true;
                            pila.Apilar(new NodoPilaDFS(j, actual.getIndice() + 1));
                        }
                    }
                }
            }
        }
        return false;
    }
    
        /**
    * Busca una palabra en el tablero usando BFS (Breadth-First Search) con tu clase Cola.
    * @param palabra La palabra a buscar.
    * @param listaLetras El tablero de letras (4x4 linealizado).
    * @return true si la palabra existe, false en caso contrario.
    */
       public boolean buscarPalabraBFS(String palabra, String[] listaLetras){
        if(palabra == null || palabra.isEmpty() || listaLetras == null || listaLetras.length != 16) {
            return false;
        }
        Cola cola = new Cola();
        
        for(int i = 0; i <16; i++){
            if(listaLetras[i]. charAt(0) == palabra.charAt(0)){
                boolean[] visitados = new boolean[16];
                visitados[i] = true;
                cola.Encolar(new NodoCola(i, 1, visitados));
            }
        }
        while(!cola.EsVacio()){
            NodoCola actual =cola.getHead();
            cola.Desencolar();
            
            if(actual.getIndice() == palabra.length()){
                return true;
            }
            int nodoActual = actual.getNodo();
            int siguienteIndice = actual.getIndice();
            boolean[] visitadosActual = actual.getVisitados();
            
            for(int i=0; i< 16; i++){
                if(aristas[nodoActual][i] && !visitadosActual[i]){
                    if(listaLetras[i].charAt(0) == palabra.charAt(siguienteIndice)){
                        boolean[] nuevoVisitado = visitadosActual.clone();
                        nuevoVisitado[i] = true;
                        cola.Encolar(new NodoCola(i, siguienteIndice +1 , nuevoVisitado));
                    }
                }
            }
        }
        return false;
    
    }
    
    
    public boolean buscarDesde(int nodo, String palabra, int indice, boolean[] visitados, String[] listaLetras){
        if(indice == palabra.length()){
            return true;}
       if(listaLetras[nodo].charAt(0) !=(palabra.charAt(indice))){
            return false;
        }
       
       visitados[nodo]=true;
       for(int i = 0; i<16; i++){
           if(aristas[nodo][i] && !visitados[i]){
               if(buscarDesde(i, palabra, indice+1, visitados, listaLetras)){
               return true;}
           }
       }
       visitados[nodo] = false;
       return false;
        

    }    
    


 }
    
    
   



   

