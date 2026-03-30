package Exemplo.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Criando a cantina
        Cantina_Inatel cantina = new Cantina_Inatel();
        cantina.nome = "Cantina do Inatel";

        // Criando 3 salgados
        Salgado s1 = new Salgado(leitor.nextLine());
        Salgado s2 = new Salgado(leitor.nextLine());
        Salgado s3 = new Salgado(leitor.nextLine());

        // Adicionando os salgados na cantina
        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        // Mostrando as informações
        cantina.mostraInfo();
    }
}