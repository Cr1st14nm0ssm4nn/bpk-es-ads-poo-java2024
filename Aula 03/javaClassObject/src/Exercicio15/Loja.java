package Exercicio15;

public class Loja {
    String nome;
    String endereço;
    int telefone;

    public Loja(String nome, String endereço, int telefone){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }


    public void abrir(){

        System.out.println("Abrindo a " + nome);
    }
    public  void fechar(){

        System.out.println("Fechando a " + nome);
    }

}
