import java.util.Scanner;
public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Escreva o valor de temperatura que você deseja converter de Celsius para Fahrenheit");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + (int) (fahrenheit));

    }
}