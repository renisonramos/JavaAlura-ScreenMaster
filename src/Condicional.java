public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 10;
        String tipoPlano = "premium";

        if (anoDeLancamento >= 2019) {
            System.out.println("Filmes lançamentos que a galera estam curtindo");
        } else {
            System.out.println("Esse filme não é um lançamento mas vale a pena assistir.");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado, aproveite!");
        } else {
            System.out.println("Você precisa pagar a locação.");
        }

    }
}
