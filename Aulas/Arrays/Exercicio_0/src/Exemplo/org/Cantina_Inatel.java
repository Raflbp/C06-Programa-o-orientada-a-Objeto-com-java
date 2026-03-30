package Exemplo.org;

public class Cantina_Inatel {
    public String nome;
    // Criando um array para guardar os salgados (ex: capacidade para 10)
    Salgado[] salgados = new Salgado[10];

    public void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgados.length; i++) {
            if (salgados[i] == null) {
                salgados[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Salgados disponíveis:");
        for (Salgado s : salgados) {
            if (s != null) {
                System.out.println(s.nome);
            }
        }
    }
}