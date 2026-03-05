import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        try(Scanner teclado = new Scanner(System.in)) {
            teclado.useLocale(Locale.US);

            int qnt_inteiros,qnt_meia; //Quantidade de ingressos
            float valor_inteiro,valor_media;//Valor dos ingressos
            float total_inteiros;
            float total_meia;
            float valor_total;
            float media_valor;

            //Entrada na quantidade e valor dos ingressos
            System.out.println("Digite a quantidade de ingressos inteiros");
            qnt_inteiros = teclado.nextInt();
            System.out.println("Digite a valor dos ingressos inteiros");
            valor_inteiro  = Float.parseFloat(teclado.next().replace(",", "."));
            System.out.println("Digite a quantidade de ingressos meia entrada");
            qnt_meia =  teclado.nextInt();
            System.out.println("Digite a valor dos ingressos meia entrada");
            valor_media = Float.parseFloat(teclado.next().replace(",", "."));

            //Calcula Total e media
            total_inteiros = qnt_inteiros * valor_inteiro;
            total_meia = qnt_meia * valor_media;
            valor_total = total_inteiros + total_meia;
            media_valor = valor_total / (qnt_inteiros + qnt_meia);

            //Saida Dos valores calculados
            System.out.printf("Valor total ingressos inteiros: %.2f%n", total_inteiros);
            System.out.printf("Valor total ingressos meia: %.2f%n", total_meia);
            System.out.printf("Valor total: %.2f%n", valor_total);
            System.out.printf("Valor médio por ingresso: %.2f%n", media_valor);

        }
    }
}
