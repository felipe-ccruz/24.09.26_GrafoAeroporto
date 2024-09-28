import java.util.ArrayList;

public class FloydWarshall {
    
    public static final int INF = 99999;
    
    public void floydWarshall(ArrayList<Airport> airports, ArrayList<Edge> edges) {
        int n = airports.size();
        int[][] dist = new int[n][n];
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0;  
                } else {
                    dist[i][j] = INF;  
                }
            }
        }
        
        
        for (Edge edge : edges) {
            int u = airports.indexOf(edge.source);
            int v = airports.indexOf(edge.target);
            dist[u][v] = edge.distance;
        }
        
        // EXECUTING Floyd-Warshall  
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        
        // DISTANCE MATRIX
        System.out.println("Matriz de distâncias:");
        
        int fieldWidth = 11; 
        System.out.printf("%-" + fieldWidth + "s", "");    
        for (int i = 0; i < n; i++) {
            System.out.printf("%-" + fieldWidth + "s", airports.get(i).getName());
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%-" + fieldWidth + "s", airports.get(i).getName());
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF) {
                    System.out.print(ANSI_PURPLE);
                    System.out.printf("%-" + fieldWidth + "s", "INF");
                    System.out.print(ANSI_RESET);
                } else {
                    System.out.print(ANSI_CYAN);
                    System.out.printf("%-" + fieldWidth + "d", dist[i][j]);  // Espaçamento ajustado para números
                    System.out.print(ANSI_RESET);
                }
            }
            
            System.out.println();
        }
    }

         // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}