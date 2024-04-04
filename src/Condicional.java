public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 1985;
        boolean inluidoNoPlano = true;
        double notaMediaDoFilme = (5 + 4.5 + 4.5 + 3 + 4.2)/ 5;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2024) {
            System.out.println("Lançamento que os clientes estão curtindo!");

        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (inluidoNoPlano || tipoPlano.equals("plus") ) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("deve pagar a locação");
        }
    }
}
