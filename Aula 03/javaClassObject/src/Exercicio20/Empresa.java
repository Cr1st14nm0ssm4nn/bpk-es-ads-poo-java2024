package Exercicio20;

public class Empresa {
    String nome;
    int cnpj;
    int numeroFuncionarios;



    public Empresa(String nome, int cnpj, int numeroFuncionarios){
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
    }


    public void contratar(){
        System.out.println("Adicionando o funcionario " + nome);
    }

    public void demitir(){
        System.out.println("Removendo o funcionário" + nome);
    }




}
