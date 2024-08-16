package Exercicio04;

public class ContaTeste {
    public static void main(String[] args) {


        Conta conta1 = new Conta(1, 300.00);
        Conta conta2 = new Conta(2, 500.00);


        System.out.println(conta1);
        System.out.println(conta2);


        conta1.depositar(100.00);
        conta2.sacar(50.00);



        System.out.println(conta1);
        System.out.println(conta2);
    }
}
