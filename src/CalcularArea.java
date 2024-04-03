import java.util.Scanner;

public class CalcularArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        double ladoOuRaio;
        double area;

        System.out.println("""
                Digite o número da opção que você deseja:
                
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """);
        opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o valor do lado do quadrado:");
            ladoOuRaio = sc.nextDouble();
            area = ladoOuRaio * ladoOuRaio;
            System.out.println("A área desse quadrado é " + area);
        } else {
            System.out.println("Digite o valor do raio do círculo:");
            ladoOuRaio = sc.nextDouble();
            area = ladoOuRaio * ladoOuRaio * Math.PI;
            System.out.println("A área desse círculo é " + area);
        }
    }
}
