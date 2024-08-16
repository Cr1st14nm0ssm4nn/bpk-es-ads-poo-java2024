package Exercicio02;

public class CelularTeste {
    public class testecelular {
        public static void main(String[] args) {
            Celular meuCelular = new Celular("Iphone", "SE", 100);

            meuCelular.ligar();
            meuCelular.desligar();
        }
    }
}
