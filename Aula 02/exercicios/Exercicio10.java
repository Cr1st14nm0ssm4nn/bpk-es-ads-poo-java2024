import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        int s=0;
        int inc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        int valor = scanner.nextInt();

        inc= valor-1;

        while(s == 0 && inc >=3){

            int resp=valor%inc;

            if(resp==0 )
            {
                s = 1;
                System.out.println("não é primo");
            }
            else if(resp !=0 && inc ==3)
            {
                System.out.println("é primo");
            }
            inc--;
        }
    }
}
