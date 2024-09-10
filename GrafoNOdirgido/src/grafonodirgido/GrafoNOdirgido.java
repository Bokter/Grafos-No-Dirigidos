
package grafonodirgido;

/**
 *
 * @author rojasdelahoz
 */
public class GrafoNOdirgido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo g = new Grafo();
        
        Vertice PC1 = new Vertice("PC1");
        Vertice PC2 = new Vertice("PC2");
        
        g.addVertice(PC1);
        g.addVertice(PC2);
        
        g.connectVertices(PC1, PC2);
        
        Vertice PC3 = new Vertice("PC3");
        Vertice PC4 = new Vertice("PC4");
        Vertice PC5 = new Vertice("PC5");
        
        
        g.addVertice(PC3);
        g.addVertice(PC4);
        g.addVertice(PC5);
        
        // PC1 con PC2 Y PC5
        
        
        g.connectVertices(PC1, PC5);
        
        // PC3 con PC4
        
        g.connectVertices(PC3, PC4);
        
        // PC5 con PC4 y PC2
        
        g.connectVertices(PC5, PC4);
        g.connectVertices(PC5, PC2);
        
        // Imprimir
        
        g.print();
 
    }
    
}
