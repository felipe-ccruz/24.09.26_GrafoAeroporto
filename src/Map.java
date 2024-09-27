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
        Airport a1 = new Airport("Sao Paulo", "a1");
        Airport a2 = new Airport("Rio de Janeiro", "a2");
        Airport a3 = new Airport("Belo Horizonte", "a3");
        Airport a4 = new Airport("Brasilia", "a4");
        Airport a5 = new Airport("Salvador", "a5");
        Airport a6 = new Airport("Fortaleza", "a6");
        Airport a7 = new Airport("Manaus", "a7");
        Airport a8 = new Airport("Curitiba", "a8");
        Airport a9 = new Airport("Recife", "a9");
        Airport a10 = new Airport("Porto Alegre", "a10");
        Airport a11 = new Airport("Belem", "a11");
        Airport a12 = new Airport("Goiania", "a12");
        Airport a13 = new Airport("Sao Luis", "a13");
        Airport a14 = new Airport("Maceio", "a14");
        Airport a15 = new Airport("Natal", "a15");
        Airport a16 = new Airport("Teresina", "a16");
        Airport a17 = new Airport("Joao Pessoa", "a17");
        Airport a18 = new Airport("Aracaju", "a18");
        Airport a19 = new Airport("Campo Grande", "a19");
        Airport a20 = new Airport("Cuiaba", "a20");
        Airport a21 = new Airport("Florianopolis", "a21");
        Airport a22 = new Airport("Palmas", "a22");
        Airport a23 = new Airport("Rio Branco", "a23");
        Airport a24 = new Airport("Porto Velho", "a24");
        Airport a25 = new Airport("Boa Vista", "a25");
        Airport a26 = new Airport("Macapa", "a26");
        Airport a27 = new Airport("Vitoria", "a27");


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
}
