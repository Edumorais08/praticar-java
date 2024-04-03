import java.util.Scanner;

public class positivoOuNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Digite um número: ");
        numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("Número positivo");
        } else if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número neutro");
        }
    }
}
