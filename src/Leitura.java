import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de Lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual a nota você daria para esse filme? ");
        int notaDoFilme = leitura.nextInt();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(notaDoFilme);

    }
}
