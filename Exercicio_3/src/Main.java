import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            teclado.useLocale(Locale.US);

            int qunt = 0;

            for (int i = 0; i < 3; i++) {
                if (teclado.hasNextInt()) {
                    int qnt_lanches = teclado.nextInt();
                    qunt = qunt + qnt_lanches;
                }
            }

            System.out.println("Total: " + qunt);
        } // O teclado fecha automaticamente aqui por causa do try-with-resources
    }
}