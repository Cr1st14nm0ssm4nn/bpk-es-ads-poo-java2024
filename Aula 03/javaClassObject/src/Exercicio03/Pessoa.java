package Exercicio03;

public class Pessoa {
    String nome;
    int idade;
    double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void apresentar() {
        System.out.println("meu nome é " + nome + ", tenho " + idade + " anos e minha altura é " + altura + " metros.");
    }
}
