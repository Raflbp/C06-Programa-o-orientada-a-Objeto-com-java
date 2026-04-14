package br.inatel.poo.turmar;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno("Ana", "2024001", new double[]{8.0, 7.5, 9.0});
        Aluno aluno2 = new Aluno("Bruno", "2024002", new double[]{6.5, 7.0, 8.0});
        Aluno aluno3 = new Aluno("Carla", "2024003", new double[]{9.5, 8.5, 10.0});

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        System.out.println("=== Lista de alunos ===");
        turma.listarAlunos();

        Aluno melhorAluno = turma.buscarMelhorAluno();

        if (melhorAluno != null) {
            System.out.println("=== Melhor aluno ===");
            melhorAluno.mostrarInfo();
        }
    }
}