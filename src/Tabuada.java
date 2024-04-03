import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double conta;

        System.out.println("Digite um número:");
        numero = sc.nextDouble();
        System.out.println("A Tabuada desse número é:");

        for (int contador = 1; contador < 11; contador++){
            conta = contador * numero;
            System.out.println(contador + " X " + numero + " = " + conta);
        }
    }
}
