import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua nota para o filme de 0 a 10: ou digite -1 para encerrar o loop");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas != 0) {
            System.out.println("A média das avaliações é " + mediaAvaliacao / totalDeNotas);
        }
    }
}
