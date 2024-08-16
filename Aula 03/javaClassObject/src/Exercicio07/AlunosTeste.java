package Exercicio07;

public class AlunosTeste {
    public static void main(String[] args){

        int[] notas = {30, 60, 80, 75};

      Alunos meuAluno = new Alunos("Josoé",1234,"eng",notas);

        int media = meuAluno.calcular();
        System.out.println("A média das notas de " + meuAluno.nome + " é " + media);





    }
}
