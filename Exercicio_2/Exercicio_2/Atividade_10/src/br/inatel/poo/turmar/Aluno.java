package br.inatel.poo.turmar;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média: %.2f%n", calcularMedia());
    }
}