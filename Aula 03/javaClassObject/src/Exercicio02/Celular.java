package Exercicio02;

public class Celular {
        String marca;
        String modelo;
        int capacidadeBateria;
        boolean ligado;

        public Celular(String marca, String modelo, int capacidadeBateria) {
            this.marca = marca;
            this.modelo = modelo;
            this.capacidadeBateria = capacidadeBateria;
            this.ligado = false;
        }

        public void ligar() {
            if (!ligado) {
                ligado = true;
                System.out.println("O celular " + modelo + " da marca " + marca + " foi ligado.");
            }
        }

        public void desligar() {
            if (ligado) {
                ligado = false;
                System.out.println("O celular " + modelo + " da marca " + marca + " foi desligado.");
            }
        }
    }

