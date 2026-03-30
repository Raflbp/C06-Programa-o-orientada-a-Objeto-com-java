package Exemplo_1;
import java.util.Scanner;

public class Banda {

    Scanner leitor = new Scanner(System.in);

    Membro mebro = new Membro();
    Empresario empresario = new Empresario();
    Musica musica = new Musica();

    public String nome;
    public String genero;

    public void Mostrarinfo(){
        System.out.println("Nome da banda " + this.nome + "| genero musical " + this.genero);
        System.out.println("Empresario " + empresario.Nome + " | Cnpj: " + empresario.Cnpj);
        System.out.println("Membro da banda :" + mebro.nome + " | Função na banda " + mebro.function);
        System.out.println("Nome da muscia: " + musica.nome + " | Tempo da musica: " + musica.duracao);
    }

    public void addMusicaNova(Musica musica){
        System.out.println("Digite o nome da musicia: ");
        musica.nome =  (leitor.nextLine());

        System.out.println("Digite a duração da musica: ");
        musica.duracao = Double.parseDouble(leitor.nextLine());

        System.out.println("Sua musica: " + musica.nome + " | E sua duração é de " + musica.duracao);
    }

    public void addMembroNovo(Membro membro){
        System.out.println("Digite o nome do novo membro: ");
        membro.nome = (leitor.nextLine());

        System.out.println("Digite a sua função: ");
        membro.function = (leitor.nextLine());

        System.out.println("Novo membro: " + musica.nome + " | função:" + musica.duracao);
    }
}
