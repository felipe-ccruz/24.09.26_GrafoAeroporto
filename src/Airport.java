import java.util.ArrayList;

public class Airport {
    private String name;
    private ArrayList<Airport> entering;
    private ArrayList<Airport> leaving;
    public Airport(String name) {
        this.name = name;
        this.entering = new ArrayList<Airport>();
        this.leaving = new ArrayList<Airport>();
    }
    
    public void addEnteringAirport(Airport airport) {
        entering.add(airport);
    }

    public void addLeavingAirport(Airport airport) {
        leaving.add(airport);
    }
    
    public void printEnteringAirport() {

        for (Airport a : entering) {
            System.out.print(" " + a.getName() + " ");
        }
    }

    public void printLeavingAirport() {
        for (Airport a : leaving) {
            System.out.print(" " + a.getName() + " ");
        }
    }

    public void printStatus(){
        System.out.println("\n\n-----------------------AIRPORT--" + getName() + "-----------------------");
        System.out.println("- LEAVING:");
        System.out.print("  [");
        printLeavingAirport();
        System.out.println("]\n");

        System.out.println("- ENTERING:");
        System.out.print("  [");
        printEnteringAirport();
        System.out.println("]\n");
    }


    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Airport> getEntering() {
        return entering;
    }
    public ArrayList<Airport> getLeaving() {
        return leaving;
    }

}
