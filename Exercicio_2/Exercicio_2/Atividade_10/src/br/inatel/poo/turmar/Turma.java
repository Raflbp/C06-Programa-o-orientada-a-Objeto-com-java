package br.inatel.poo.turmar;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma() {
        this.alunos = new Aluno[50];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Não foi possível adicionar aluno: turma cheia.");
        }
    }

    public void listarAlunos() {
        if (quantidadeAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            alunos[i].mostrarInfo();
            System.out.println();
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) {
            return null;
        }

        Aluno melhorAluno = alunos[0];

        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calcularMedia() > melhorAluno.calcularMedia()) {
                melhorAluno = alunos[i];
            }
        }

        return melhorAluno;
    }
}