public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Master");
        System.out.println("Filme: Homem Aranha: Sem volta pra casa");

        int anoDeLancamento = 2019;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10;
        double mediaDoFilme = (10+10+10) / 3;

        String sinopse = """
                Filme Homem aranha
                Filme baseado nas histórias em quadrinhos do Homem-Aranha
                abordam-se temas relacionados ao Multiverso.
                """;

        System.out.println(sinopse + "Nota: " + mediaDoFilme);

        //Casting (Conversão de Tipos, convertendo a varialvel mediaDoFilme para Inteiro
        int classificacao = (int) (mediaDoFilme/2);
        System.out.println(classificacao);









    }
}