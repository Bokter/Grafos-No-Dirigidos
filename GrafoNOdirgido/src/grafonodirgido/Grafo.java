/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafonodirgido;

import java.util.ArrayList;

/**
 *
 * @author rojasdelahoz
 */
public class Grafo {

    private ArrayList<Vertice> listaAdyacencia;
    private int[][] matrizAdyacencia;

    public Grafo() {
        this.listaAdyacencia = new ArrayList<>();
    }

    public void addVertice(Vertice v) {
        this.listaAdyacencia.add(v);
    }

    public void connectVertices(Vertice v1, Vertice v2) {

        if (this.matrizAdyacencia == null) {
            this.matrizAdyacencia = new int[listaAdyacencia.size()][listaAdyacencia.size()];
        }

        v1.agregarAdyacente(v2);
        v2.agregarAdyacente(v1);

        this.matrizAdyacencia[v1.getId()][v2.getId()] = 1;
        this.matrizAdyacencia[v2.getId()][v1.getId()] = 1;

    }
    // PC1 con PC2 y PC5, PC3 con PC4, PC5 con PC4 y PC2

    public void print(){
    
        // Lista
        System.out.println("Lista de adyacencia: ");
        for (Vertice v : listaAdyacencia) {
            System.out.println(" | "+v);
        }
        
        System.out.println("");
        
        // Matriz
        
        System.out.println("");
        
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(" | "+matrizAdyacencia[i][j]);
            }
            System.out.println("");
        }
        
    
    }
    

}
