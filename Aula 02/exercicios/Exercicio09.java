import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        float valor = scanner.nextFloat();

        System.out.println("digite outro numero inteiro");
        float valor02 = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("multiplicação (*), divisão (/), soma(+), subtração(-)");
        String operacao = scanner.nextLine();

        switch (operacao){
            case "*":
                valor*=valor02;
                break;
            case "/":
                valor/=valor02;
                break;
            case "+":
                valor+=valor02;
                break;
            case "-":
                valor-=valor02;
                break;
            default:
                System.out.println("operação invalida");
        }
        System.out.println("o resultado é:" + valor);
    }
}
