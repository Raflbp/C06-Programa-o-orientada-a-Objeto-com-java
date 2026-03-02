import java.util.Random;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        try(Scanner teclado = new Scanner(System.in)){
            teclado.useLocale(Locale.US);
            Random rand = new Random();

            int x = rand.nextInt(100) + 1;
            int n_usuario;

            System.out.println(x);

            System.out.println("Tente adivinhar");

            do {
                n_usuario = teclado.nextInt();

                if (n_usuario != x){
                    System.out.println("Tente novamente");
                }

                if (n_usuario > x)
                    System.out.println("O numero é menor");
                else
                    System.out.println("O numero é maior");

            }while (n_usuario != x );

            System.out.println("Numero encontrado!!!");

        }
    }
}