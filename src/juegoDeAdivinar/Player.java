package juegoDeAdivinar;

import java.util.Random;

public class Player {
    private int number;

    public Player(int number) {
        this.number = number;
    }

    public Player() {

    }

    public int getNumber() {
        return number;
    }

    public int guess() {
        Random generadorAleatorios = new Random();
        int numeroAleatorio = 0 + generadorAleatorios.nextInt(9);
        System.out.println(numeroAleatorio);

        return numeroAleatorio;
    }
}
