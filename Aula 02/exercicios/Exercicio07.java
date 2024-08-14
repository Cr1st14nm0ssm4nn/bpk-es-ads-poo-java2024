import java.util.Scanner;

public class Exercicio07 {
 static void soma(int valor, int valor02){
     System.out.println("soma é: " + (valor + valor02));
    }

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite um numero inteiro");
    int valor = scanner.nextInt();

    System.out.println("digite outro numero inteiro");
    int valor02 = scanner.nextInt();

    soma(valor, valor02);

}
}