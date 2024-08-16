package Exercicio01;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro("1984", "George Orwell", 281);

        System.out.println("digite uma pagina para abrir");
        Integer pag = scanner.nextInt();

        System.out.println("voce está lendo o " + livro + " na pagina " + pag);

    }

}
