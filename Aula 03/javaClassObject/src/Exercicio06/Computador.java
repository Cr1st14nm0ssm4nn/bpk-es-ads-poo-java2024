package Exercicio06;

public class Computador {

    String processador;
    int memoria;
    int armazenamento;
    boolean ligado;


    public Computador(String processador, int memoria, int armazenamento) {
        this.processador = processador;
        this.memoria = memoria;
        this.ligado = false;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        if(!ligado) {
            ligado = true;
            System.out.println("O computador com o processador" + processador + "de memoria" + memoria + "de armazenamento" + armazenamento + "Está ligado");
        }
    }


    public void desligado() {
        if(ligado) {
            ligado = false;
            System.out.println("O computador com o processador" + processador + "de memoria" + memoria + "de armazenamento" + armazenamento + "Está desligado");
        }
    }
}
