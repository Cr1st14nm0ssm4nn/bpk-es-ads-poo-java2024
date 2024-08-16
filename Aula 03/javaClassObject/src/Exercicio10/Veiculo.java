package Exercicio10;

public class Veiculo {
    String tipo;
    //a placa vai ser somente numeros
    int placa;
    String cor;


    public Veiculo(String tipo, int placa, String cor){
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer(){
        System.out.println("abastecendo o " + tipo);

    }
    public void lavar(){
        System.out.println("lavando o " + tipo);

    }
}
