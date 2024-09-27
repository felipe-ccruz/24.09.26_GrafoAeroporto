import java.util.ArrayList;

public class FloydWarshall {
    
    public static final int INF = 99999;  // valor para impossivel
    
    public void floydWarshall(ArrayList<Airport> airports, ArrayList<Edge> edges) {
        int n = airports.size();
        int[][] dist = new int[n][n];
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0;  // A distância de uma cidade para ela mesma é zero
                } else {
                    dist[i][j] = INF;  // Inicialmente, não há caminho entre os nós
                }
            }
        }
        
        // Preenchendo a matriz de distâncias com as arestas
        for (Edge edge : edges) {
            int u = airports.indexOf(edge.source);
            int v = airports.indexOf(edge.target);
            dist[u][v] = edge.distance;
        }
        
        // Executando o algoritmo de Floyd-Warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        // Formatação da matriz de distâncias
        System.out.println("Matriz de distâncias:");
        
        // formatacao para melhorar visualizacao 
        int fieldWidth = 10; 
        System.out.printf("%-" + fieldWidth + "s", "");    
        for (int i = 0; i < n; i++) {
            System.out.printf("%-" + fieldWidth + "s", airports.get(i).getName());
        }
        System.out.println();
        // Imprimir nome do aeroporto
        for (int i = 0; i < n; i++) {
            System.out.printf("%-" + fieldWidth + "s", airports.get(i).getName());
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF) {
                    System.out.printf("%-" + fieldWidth + "s", "INF");
                } else {
                    System.out.printf("%-" + fieldWidth + "d", dist[i][j]);  // Espaçamento ajustado para números
                }
            }
            System.out.println();
        }
        
        /* // Imprimindo as cidades acessíveis a partir de cada cidade (opcional)
        for (int i = 0; i < n; i++) {
            System.out.println("A partir da cidade: " + airports.get(i).getName());
            boolean hasAccessibleCities = false;
            System.out.println("Cidades acessíveis:");
            for (int j = 0; j < n; j++) {
                if (dist[i][j] != INF && i != j) {
                    System.out.println("  -> " + airports.get(j).getName() + " (Distância: " + dist[i][j] + ")");
                    hasAccessibleCities = true;
                }
            }
            if (!hasAccessibleCities) {
                System.out.println("  Nenhuma cidade acessível.");
            }
            System.out.println();
        } */
    }
}