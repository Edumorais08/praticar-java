import java.util.Scanner;

public class MediaNotasFilmes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notaMediaInt;

        float imdb,
                letterboxd,
                rottenTomatoes,
                metacritic,
                notaMedia;

        String filme;

        System.out.println("Qual filme você deseja fazer a média das notas?");
        filme = sc.nextLine();
        System.out.println("insira a nota do IMDB:");
        imdb = sc.nextFloat();
        System.out.println("insira a nota do Letterboxd:");
        letterboxd = (sc.nextFloat())*2;
        System.out.println("insira a nota critica do Rotten Tomatoes:");
        rottenTomatoes = (sc.nextFloat())/10;
        System.out.println("insira a nota do Metacritic:");
        metacritic = (sc.nextFloat())/10;

        notaMedia = (imdb + letterboxd + rottenTomatoes + metacritic)/4;
        notaMediaInt = (int) (notaMedia);

        System.out.println(String.format("A nota média de 0 a 10 do filme %s é: %d",filme,notaMediaInt));

    }
}
