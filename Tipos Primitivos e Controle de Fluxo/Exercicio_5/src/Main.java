import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            teclado.useLocale(Locale.US);
            int repetir;

            do {
                System.out.println("Quantos alunos estão matriculados? (10, 20 ou 30)");
                int qntAlunos = teclado.nextInt();

                // Validando a entrada
                if (qntAlunos == 10 || qntAlunos == 20 || qntAlunos == 30) {
                    switch (qntAlunos) {
                        case 10:
                        case 20:
                            System.out.println("Sua sala é I-06");
                            break;
                        case 30:
                            System.out.println("Sua sala é I-05");
                            break;
                    }
                } else {
                    System.out.println("Valor não reconhecido! Use apenas 10, 20 ou 30.");
                }

                System.out.println("\nPara repetir a operação, digite 1. Para sair, digite qualquer outro número:");
                repetir = teclado.nextInt();

            } while (repetir == 1);

            System.out.println("Programa encerrado.");
        }
    }
}