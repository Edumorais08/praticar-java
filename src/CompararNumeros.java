import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroA,
                numeroB;

        System.out.println("Insira um número inteiro:");
        numeroA = sc.nextInt();
        System.out.println("Insira um número inteiro:");
        numeroB = sc.nextInt();

        if (numeroB == numeroA) {
            System.out.println("Os dois números são iguais!");
        } else if (numeroA > numeroB) {
            System.out.println("Os dois números são diferentes, o primeiro é maior!");
        } else {
            System.out.println("Os dois números são diferentes, o segundo é maior!");
        }
    }
}
