package Exercicio07;

public class Alunos {
    String nome;
    int matricula;
    String curso;
    int[] notas;



    public Alunos(String nome, int matricula, String curso, int[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;

    }



    public int calcular() {
        int soma = 0;
        for(int nota : notas){
            soma += nota;
        }

        return soma / notas.length;

    }
}
