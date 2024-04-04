import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);
        int chute;
        int tentativas = 4;

        System.out.println(numeroAleatorio);

        for (int contador = 0; contador < 5; contador++ ) {
            System.out.println("Digite um número de 1 a 100 para tentar adivinhar o número secreto, você tem 5 tentativas:");
            chute = sc.nextInt();

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns, você acertou! O número secreto era " + numeroAleatorio);
                break;
            } else if (chute != numeroAleatorio && contador == 4) {
                System.out.println("Acabaram as tentativas ): o número secreto era " + numeroAleatorio);
                break;
            } else if (chute > numeroAleatorio) {
                System.out.println("O seu chute é maior que o número secreto, tente novamente:");
            } else if (chute < numeroAleatorio) {
                System.out.println("O seu chute é menor que o número secreto, tente novamente:");
            }

            if (tentativas == 1) {
                System.out.println("resta " + tentativas + " tentativa!");
            } else {
                System.out.println("restam " + tentativas + " tentativas!");
            }

            tentativas--;

        }
    }
}
