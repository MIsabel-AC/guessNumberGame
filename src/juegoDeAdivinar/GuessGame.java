package juegoDeAdivinar;

import java.sql.SQLOutput;
import java.util.Random;

public class GuessGame {
    private String p1;
    private String p2;
    private String p3;

    public GuessGame() {

    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }


    public GuessGame(String p1, String p2, String p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void startGame(int numeroAleatorio) {
        Player[] players = new Player[3];
        players[0] = new Player();
        players[1] = new Player();
        players[2] = new Player();

        int eleccion = -1;

        do {
            for (int i=0; i<players.length; i++) {
                System.out.println("Turno del jugador " + (i+1) + ".");
                eleccion = players[i].guess();

                if (eleccion == numeroAleatorio) {
                    System.out.println("EL JUGADOR " + (i+1) + " HA GANADO!");
                    break;
                }
            }
        } while (eleccion!=numeroAleatorio);
    }

    public int solucionNumero() {
        Random generadorAleatorios = new Random();

        int numeroAleatorio = 0 + generadorAleatorios.nextInt(9);
        System.out.println("La solución real  es *****" + numeroAleatorio + "*****");

        return numeroAleatorio;
    }

}
