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
        Airport a3 = new Airport("Rio Branco", "a3");
        Airport a4 = new Airport("Porto Velho", "a4");
        Airport a5 = new Airport("Boa Vista", "a5");
        Airport a6 = new Airport("Macapa", "a6");

        // Adicionando apenas as capitais da região Norte
        airports.add(a1);  // Manaus
        airports.add(a2);  // Belem
        airports.add(a3);  // Rio Branco
        airports.add(a4);  // Porto Velho
        airports.add(a5);  // Boa Vista
        airports.add(a6);  // Macapa

    }
}
