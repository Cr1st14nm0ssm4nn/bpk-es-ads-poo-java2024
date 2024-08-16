package Exercicio08;

public class ProfessoresTeste {
    public static void main(String[] args) {
        Professores meuProfessor = new Professores("Girafales", 71, "Engenharia de Software");

        int nota = 7;

        meuProfessor.aula();
        meuProfessor.corrigir(nota);


    }
}