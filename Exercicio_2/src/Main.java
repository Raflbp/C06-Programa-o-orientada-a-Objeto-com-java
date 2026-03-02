public class Main {
    public static void main(String[] args) {

        int qnt_inteiros = 8;
        int qnt_meia = 5;
        float valor_inteiro = 30;
        float valor_media = 15;
        float total_inteiros;
        float total_meia;
        float valor_total;
        float media_valor;

        total_inteiros = qnt_inteiros * valor_inteiro;
        total_meia = qnt_meia * valor_media;
        valor_total = total_inteiros + total_meia;
        media_valor = valor_total / (qnt_inteiros + qnt_meia);

        System.out.println("Valor total ingressos inteiros: " + total_inteiros);
        System.out.println("Valor total ingressos meia: " + total_meia);
        System.out.println("Valor total: " + valor_total);
        System.out.println("Valor médio por ingresso: " + media_valor);

    }
}
