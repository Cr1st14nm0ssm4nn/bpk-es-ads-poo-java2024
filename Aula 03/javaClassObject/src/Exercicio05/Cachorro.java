package Exercicio05;

public class Cachorro {
    String nome;
    String raça;
    int idade;


    public Cachorro(String nome, String raça, int idade) {
        this.nome = nome;
        this.raça = raça;
        this.idade = idade;

    }

    public void latir() {
        System.out.println(nome + " está latindo");

    }

    public void correr() {
        System.out.println(nome + " está correndo");


    }
}
