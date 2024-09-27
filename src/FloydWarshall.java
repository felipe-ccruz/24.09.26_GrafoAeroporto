import java.util.ArrayList;

public class FloydWarshall {
    
    public static final int INF = 99999;  // Definimos um valor muito grande para representar a ausência de conexão
    
    public void floydWarshall(ArrayList<Airport> airports, ArrayList<Edge> edges) {
        int n = airports.size();
        int[][] dist = new int[n][n];
        
        // Inicializando a matriz de distâncias
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = INF;  // Removendo o loop, distância de uma cidade para ela mesma é infinita
                } else {
                    dist[i][j] = INF;  // Inicialmente, não há caminho entre os nós
                }
            }
        }
        
        // direcoes 
        for (Edge edge : edges) {
            int u = airports.indexOf(edge.source);
            int v = airports.indexOf(edge.target);
            dist[u][v] = edge.distance;
        }
        
        //floyd warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("A partir da cidade: " + airports.get(i).getName());
            boolean hasAccessibleCities = false;  // true = cidade acessivel
            System.out.println("Cidades acessíveis:");
            for (int j = 0; j < n; j++) {
                if (dist[i][j] != INF && i != j) {  // aqui mostra apenas cidades acessiveis
                    System.out.println("  -> " + airports.get(j).getName() + " (Distância: " + dist[i][j] + ")");
                    hasAccessibleCities = true;
                }
            }
            if (!hasAccessibleCities) {
                System.out.println("  Nenhuma cidade acessível.");
            }
            System.out.println();
        }
    }
}