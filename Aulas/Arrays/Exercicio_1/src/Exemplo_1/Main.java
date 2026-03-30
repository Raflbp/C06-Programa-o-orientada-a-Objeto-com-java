package Exemplo_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Banda banda = new Banda();

        Scanner leitor = new Scanner(System.in);

        banda.nome = "2zDinizz";
        banda.mebro.nome = "2z";
        banda.mebro.function = "Cantor";
        banda.musica.nome = "Beatriz";
        banda.musica.duracao = 4.23;
        banda.empresario.Nome = "Mítico";
        banda.empresario.Cnpj = 00000000000000000;

        banda.Mostrarinfo();
        banda.addMusicaNova(banda.musica);
        banda.addMembroNovo(banda.mebro);


    }
}