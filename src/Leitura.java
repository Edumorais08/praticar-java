import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu Filme Favorito:");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a sua nota para o filme de 0 a 10:");
        double avaliacao = leitura.nextDouble();


    }
}
