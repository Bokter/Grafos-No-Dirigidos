/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafonodirgido;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author rojasdelahoz
 */
public class Vertice {

    private String dato;
    private int id;
    private ArrayList<Vertice> adyacentes;
    private static int nVertices = 0;

    public Vertice(String dato) {
        this.dato = dato;
        this.adyacentes = new ArrayList<>();
        this.id = nVertices++;
    }

    public String getDato() {
        return dato;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Vertice> getAdyacentes() {
        return adyacentes;
    }

    public static int getnVertices() {
        return nVertices;
    }

    public void agregarAdyacente(Vertice v) {
        this.adyacentes.add(v);
    }

    public String toString() {
        return "Vertice{"
                + "dato ='" + dato + '\''
                + ",adyacentes="
                    + adyacentes.stream().map(Vertice::getDato).collect(Collectors.joining(", ")) + 
                "}";
}
    
}
