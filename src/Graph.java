import java.util.ArrayList;
import java.util.Random;

public class Graph {
    private int[][] connections;
    public Graph(int numAirports) {
        this.connections = new int[numAirports][numAirports];
        createConnectMat();
    }
    //ELEMENTS
    ArrayList<Airport> airports = new ArrayList<>();

    //GENERATOR
    // public void airportGenerator(String name, int numAirports){
    //     for (int i = 0; i < numAirports; i++){
    //         Airport a = new Airport(name , "a" + (i + 1));
    //         airports.add(a);
    //     }
    // }

    
    //MATRIX
    public void createConnectMat(){
        for (int i = 0; i < airports.size(); i++){
            for(int j = 0; j < airports.size(); j++){
                connections[i][j] = 0;
            }
        }
    }

    public void printConnectMat() {
        System.out.print("  ");
        for (Airport a : airports){
            System.out.print(" " + a.getName());
        }
        System.out.println();
        
        for (int i = 0; i < airports.size(); i++){
            System.out.print(airports.get(i).getName() + "[");
            for(int j = 0; j < airports.size(); j++){
                if(connections[i][j] > 0){
                    System.out.print(" " + ANSI_GREEN + connections[i][j] + ANSI_RESET + " ");
                } else{
                    System.out.print(" " + connections[i][j] + " ");
                }  
            }
            System.out.println("]");
        }
    }


    //CONNECTION
    public void connect(int source, int target){
        Airport tempSource = getAirports().get(source - 1);
        Airport tempTarget = getAirports().get(target - 1);

        tempSource.addLeavingAirport(tempTarget);
        tempTarget.addEnteringAirport(tempSource);


        connections[airports.indexOf(tempSource)][airports.indexOf(tempTarget)] = connections[airports.indexOf(tempSource)][airports.indexOf(tempTarget)] + 1;
    }

    public void printAirportConnections(){
        for(Airport a : airports){
            a.printStatus();
        }
    }


    //"IS" FUCTIONS
    public void isParallel(){
        System.out.println("\n----------------PARALLEL--------------");
        for(int i = 0; i < airports.size(); i++){
            for(int j = 0; j < airports.size(); j++){
                if(connections[i][j] > 1 ){
                    System.out.println("\nGraph has a parallel at fly: " + airports.get(i).getName() + " to " + airports.get(j).getName() + "\n");
                }  else if(connections[i][j] == connections[j][i] && connections[i][j] > 0 && i != j){
                    System.out.println("\nGraph has a parallel at fly: " + airports.get(i).getName() + " to " + airports.get(j).getName() + "\n");
                }
            }
        }
    }

    //LISTS FUNCTION
    public void adjacencyList(){
        System.out.println("\n\n Airport |   adjacency list ");

        for(int i = 0; i < airports.size(); i++){
            

            System.out.print("   " + airports.get(i).getName() + "    |  ");

            System.out.print(ANSI_CYAN);
            airports.get(i).printLeavingAirport();
            System.out.print(ANSI_RESET);
            
            System.out.println();

        }
    }


    //AUTOMATIC
    public void automatic(){
        Random random = new Random();

        int numConnections = random.nextInt(airports.size() * airports.size());

        for(int i = 0; i < numConnections; i++){
            int source = random.nextInt(airports.size()) + 1;
            int target = random.nextInt(airports.size()) + 1;

            connect(source, target);
        }
    }
    

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void creatBrazil(){
        Airport a1 = new Airport("São Paulo", "a1");
        Airport a2 = new Airport("Rio de Janeiro", "a2");
        Airport a3 = new Airport("Belo Horizonte", "a3");
        Airport a4 = new Airport("Brasília", "a4");
        Airport a5 = new Airport("Salvador", "a5");
        Airport a6 = new Airport("Fortaleza", "a6");
        Airport a7 = new Airport("Manaus", "a7");
        Airport a8 = new Airport("Curitiba", "a8");
        Airport a9 = new Airport("Recife", "a9");
        Airport a10 = new Airport("Porto Alegre", "a10");
        Airport a11 = new Airport("Belém", "a11");
        Airport a12 = new Airport("Goiânia", "a12");
        Airport a13 = new Airport("São Luís", "a13");
        Airport a14 = new Airport("Maceió", "a14");
        Airport a15 = new Airport("Natal", "a15");
        Airport a16 = new Airport("Teresina", "a16");
        Airport a17 = new Airport("João Pessoa", "a17");
        Airport a18 = new Airport("Aracaju", "a18");
        Airport a19 = new Airport("Campo Grande", "a19");
        Airport a20 = new Airport("Cuiabá", "a20");
        Airport a21 = new Airport("Florianópolis", "a21");
        Airport a22 = new Airport("Palmas", "a22");
        Airport a23 = new Airport("Rio Branco", "a23");
        Airport a24 = new Airport("Porto Velho", "a24");
        Airport a25 = new Airport("Boa Vista", "a25");
        Airport a26 = new Airport("Macapá", "a26");
        Airport a27 = new Airport("Vitória", "a27");

        airports.add(a1);
        airports.add(a2);
        airports.add(a3);
        airports.add(a4);
        airports.add(a5);
        airports.add(a6);
        airports.add(a7);
        airports.add(a8);
        airports.add(a9);
        airports.add(a10);
        airports.add(a11);
        airports.add(a12);
        airports.add(a13);
        airports.add(a14);
        airports.add(a15);
        airports.add(a16);
        airports.add(a17);
        airports.add(a18);
        airports.add(a19);
        airports.add(a20);
        airports.add(a21);
        airports.add(a22);
        airports.add(a23);
        airports.add(a24);
        airports.add(a25);
        airports.add(a26);
        airports.add(a27);
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
