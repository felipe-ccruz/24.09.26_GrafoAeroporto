import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar aeroportos
        Airport a1 = new Airport("Manaus", "a1");
        Airport a2 = new Airport("Belem", "a2");
        Airport a3 = new Airport("Macapa", "a3");
        Airport a4 = new Airport("Boa Vista", "a4");
        Airport a5 = new Airport("Rio Branco", "a5");

        // Lista de aeroportos
        ArrayList<Airport> airports = new ArrayList<>();
        airports.add(a1);
        airports.add(a2);
        airports.add(a3);
        airports.add(a4);
        airports.add(a5);

        Edge e1 = new Edge(500, a1, a2); // Distância entre Manaus e Belém
        Edge e2 = new Edge(400, a2, a5); // Distância entre Belem e Rio Branco

        Edge e3 = new Edge(200, a1, a3); // Distância entre Manaus e Macapa
        Edge e4 = new Edge(100, a3, a5); // Distância entre macapa e Rio Branco



        // Lista de arestas
        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);




        FloydWarshall fw = new FloydWarshall();
        fw.floydWarshall(airports, edges);
    }
}