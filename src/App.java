public class App {
    public static void main(String[] args) throws Exception {
        // Sao Paulo = a1
        // Rio de Janeiro = a2
        // Belo Horizonte = a3
        // Brasilia = a4
        // Salvador = a5
        // Fortaleza = a6
        // Manaus = a7
        // Curitiba = a8
        // Recife = a9
        // Porto Alegre = a10
        // Belem = a11
        // Goiania = a12
        // Sao Luis = a13
        // Maceio = a14
        // Natal = a15
        // Teresina = a16
        // Joao Pessoa = a17
        // Aracaju = a18
        // Campo Grande = a19
        // Cuiaba = a20
        // Florianopolis = a21
        // Palmas = a22
        // Rio Branco = a23
        // Porto Velho = a24
        // Boa Vista = a25
        // Macapa = a26
        // Vitoria = a27


        // Primeira rota
        Route r1 = new Route("Route-1");
        r1.addStep(1015, "sao paulo", "belem");
        r1.addStep(2853, "belem", "Cuiaba");
        r1.addStep(2676, "Cuiaba", "Joao Pessoa");
        r1.addStep(2794, "Joao Pessoa", "sao paulo");

        r1.printConnectMat();
        r1.printInfo();

        // Segunda rota
        Route r2 = new Route("Route-2");
        r2.addStep(870, "curitiba", "florianopolis");
        r2.addStep(1254, "florianopolis", "porto alegre");
        r2.addStep(2327, "porto alegre", "salvador");
        r2.addStep(1443, "salvador", "curitiba");

        r2.printConnectMat();
        r2.printInfo();

        // Terceira rota
        Route r3 = new Route("Route-3");
        r3.addStep(1578, "manaus", "fortaleza");
        r3.addStep(1407, "fortaleza", "natal");
        r3.addStep(1210, "natal", "brasilia");
        r3.addStep(2090, "brasilia", "manaus");

        r3.printConnectMat();
        r3.printInfo();


        



    }
}
