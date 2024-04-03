import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        int numeroAnterior;
        double fatorial = 0;

        System.out.println("Digite um número inteiro");
        numero = sc.nextDouble();
        numeroAnterior = (int) (numero - 1);

        while (numeroAnterior > 0) {
            numero = numero * numeroAnterior;
            numeroAnterior--;
        }

        System.out.println("O fatorial desse número é: " + numero);
    }
}
