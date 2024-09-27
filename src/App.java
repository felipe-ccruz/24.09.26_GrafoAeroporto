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


        Route r1 = new Route("Route 1");
        r1.addStep(100, "sao paulo", "belem");
        r1.addStep(100, "belem", "Cuiaba");
        r1.addStep(100, "Cuiaba", "Joao Pessoa");
        r1.addStep(100, "Joao Pessoa", "sao paulo");

        r1.printInfo();

        r1.printConnectMat();



    }
}
