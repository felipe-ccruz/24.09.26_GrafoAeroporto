import java.util.ArrayList;

public class Route {
    private String name;
    private int[][] connections;
    public Route(String name) {
        this.name = name;
        this.connections = new int[map.getAirports().size()][map.getAirports().size()];
        createConnectMat();

    }
    //ELEMENTS
    ArrayList<Edge> steps = new ArrayList<Edge>();
    Map map = new Map();

    //MATRIX
    public void createConnectMat(){
        for (int i = 0; i < map.getAirports().size(); i++){
            for(int j = 0; j < map.getAirports().size(); j++){
                connections[i][j] = 0;
            }
        }
    }


    //PRINT FUNCTIONS
    public void printConnectMat() {
        int counter = 0;

        System.out.print("\n\n  ");
        for (Airport a : map.getAirports()){
            if(counter > 8){
                System.out.print("  " + a.getId());
            } else{
                System.out.print("   " + a.getId());
            }
            counter++;
        }
        System.out.println();
        
        for (int i = 0; i < map.getAirports().size(); i++){
            if(i > 8){
                System.out.print(map.getAirports().get(i).getId() + "[");
            } else{
                System.out.print(map.getAirports().get(i).getId() + " [");
            }

            for(int j = 0; j < map.getAirports().size(); j++){
                if(connections[i][j] > 0){
                    System.out.print("  " + ANSI_PURPLE_BACKGROUND + ANSI_BLACK + connections[i][j] + ANSI_RESET + "  ");
                } else{
                    System.out.print("  " + connections[i][j] + "  ");
                }  
            }
            System.out.println("]");
        }
    }

    public void printInfo() {
        System.out.println("\n\n----------------" + getName().toUpperCase() + "----------------");
        System.out.print("\n » STEPS          |" );
        
        System.out.print(ANSI_CYAN);    
        for (Edge e : steps) {
            e.printInfo();
            System.out.print(" ");
        }
        System.out.print(ANSI_RESET);

        System.out.println("\n\n » TOTAL DISTANCE | " + ANSI_BLUE + sumDistance() + "km" + ANSI_RESET );
        System.out.println("\n--------------------------------------------------------\n\n");
    }

    //CONNETCT FUNCTIONS
    public void addStep(int distance, String source, String target) {
        Airport tempSource = findAirport(source);
        Airport tempTarget = findAirport(target);

        steps.add(new Edge(distance, tempSource, tempTarget));

        connections[map.getAirports().indexOf(tempSource)][map.getAirports().indexOf(tempTarget)] = connections[map.getAirports().indexOf(tempSource)][map.getAirports().indexOf(tempTarget)] + 1;
    }

    public Airport findAirport(String airport) {
        Airport tempAirport = null;
        for (Airport a : map.getAirports()) {
            if (a.getName().equalsIgnoreCase(airport)) {
                 tempAirport = a;
                break;
            }
        }
        return tempAirport;
    }

    public int sumDistance(){
        int sum = 0;
        for (Edge e : steps) {
            sum += e.getDistance();
        }
        return sum;
    }
    

    //GETTERS AND SETTERS
    public ArrayList<Edge> getSteps() {
        return steps;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
