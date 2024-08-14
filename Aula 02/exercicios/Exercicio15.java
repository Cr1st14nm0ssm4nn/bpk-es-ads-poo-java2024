import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero qualquer");
        int valor = scanner.nextInt();

        int i =valor -1 ;

        while(i>0){
            valor = valor*i;
            i--;
        }

        System.out.println("o fatorial é " + valor);

    }
}
