package Exercicio13;

public class Time {
    String nome;
    String tecnico;
    int numeroJogadores;


    public Time(String nome, String tecnico, int numeroJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroJogadores = numeroJogadores;
    }


    public void adicionando(){

        System.out.println("Adicionando jogadres ao time" + nome);
        numeroJogadores += 1000;
        System.out.println(numeroJogadores);
    }


    public void remover(){

        System.out.println("Adicionando jogadres ao time" + nome);
        numeroJogadores -= 200;
        System.out.println(numeroJogadores);
    }
}
