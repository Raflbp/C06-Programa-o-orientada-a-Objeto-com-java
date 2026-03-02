import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            teclado.useLocale(Locale.US);

            System.out.println("Digite sua nota");
            int NPA = teclado.nextInt();

            if (NPA >= 60) {
                System.out.println("Aprovado!!");
            } else {
                System.out.println("Digite sua NP3");
                int NP3 = teclado.nextInt();
                int NPF;

                NPF = (NP3 + NPA)/ 2;
                if (NPF >= 50) {
                    System.out.println("Aprovado: " + NPF);
                } else {
                    System.out.println("Reprovado: " + NPF);
                }
            }
        }
    }
}