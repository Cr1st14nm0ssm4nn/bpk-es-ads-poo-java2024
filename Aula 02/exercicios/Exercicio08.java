import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("seu nome é " + nome + ", e tem " + idade +" anos");
    }
}
