public class App {
    public static void main(String[] args) throws Exception {
        // a1 - Manaus
        // a2 - Belem
        // a3 - Rio Branco
        // a4 - Porto Velho
        // a5 - Boa Vista
        // a6 - Macapa

        Route r1 = new Route("Route-1");
        r1.addStep(525, "manaus", "boa vista");   
        r1.addStep(787, "boa vista", "belem");    
        r1.addStep(1098, "belem", "macapa");      
        r1.addStep(1130, "macapa", "manaus");     

        r1.printConnectMat();
        r1.printInfo();

        Route r2 = new Route("Route-2");
        r2.addStep(514, "porto velho", "rio branco");  
        r2.addStep(1322, "rio branco", "manaus");      
        r2.addStep(1297, "manaus", "belem");           
        r2.addStep(1475, "belem", "porto velho");      

        r2.printConnectMat();
        r2.printInfo();

        Route r3 = new Route("Route-3");
        r3.addStep(1475, "porto velho", "belem");      
        r3.addStep(1098, "belem", "macapa");           
        r3.addStep(787, "macapa", "boa vista");        
        r3.addStep(525, "boa vista", "manaus");        

        r3.printConnectMat();
        r3.printInfo();



        



    }
}
