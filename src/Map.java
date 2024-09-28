import java.util.ArrayList;

public class Map {
    ArrayList<Airport> airports; 
    public Map() {
        this.airports = new ArrayList<Airport>();
        creatBrazil();
    }

    
    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void creatBrazil(){
        Airport a1 = new Airport("Manaus", "a1");
        Airport a2 = new Airport("Belem", "a2");
        Airport a3 = new Airport("Macapa", "a3");
        Airport a4 = new Airport("Boa Vista", "a4");
        Airport a5 = new Airport("Rio Branco", "a5");

        // Adicionando apenas as capitais da região Norte
        airports.add(a1);  
        airports.add(a2);  
        airports.add(a3);  
        airports.add(a4);  
        airports.add(a5);  


    }
}
