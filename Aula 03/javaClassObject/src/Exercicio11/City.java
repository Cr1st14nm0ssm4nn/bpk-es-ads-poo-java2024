package Exercicio11;

public class City {
    String nome;
    int populacao;
    String estado;




    public City(String nome, int população, String estado){
        this.nome = nome;
        this.populacao = população;
        this.estado =  estado;
    }




    public void aumentar(){
        System.out.println(populacao);
        populacao += 20000;
        System.out.println("aumentou" + nome + " na população");
        System.out.println(populacao);

    }

    public void diminuir() {
        System.out.println(populacao);
        populacao -= 300;
        System.out.println("diminiu" + nome + " na população");
        System.out.println(populacao);

    }
}
