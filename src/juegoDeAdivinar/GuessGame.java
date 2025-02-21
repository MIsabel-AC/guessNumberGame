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

    public void startGame(int numeroAleatorio){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        int eleccion;

        do{
            System.out.println("Turno del p1 adivina el número: ");
            eleccion = p1.guess();
            if(eleccion==numeroAleatorio){
                System.out.println("EL JUGADOR 1 HA GANADO!");
                break;
            }

            System.out.println("Turno del p2 adivina el número: ");
            eleccion = p2.guess();
            if(eleccion==numeroAleatorio){
                System.out.println("EL JUGADOR 2 HA GANADO!");
                break;
            }

            System.out.println("Turno del p3 adivina el número: ");
            eleccion = p3.guess();
            if(eleccion==numeroAleatorio){
                System.out.println("EL JUGADOR 3 HA GANADO!");
                break;
            }
        }while(eleccion!=numeroAleatorio);
    }

    public int solucionNumero(){
        Random generadorAleatorios = new Random();

        int numeroAleatorio = 0+generadorAleatorios.nextInt(9);
        System.out.println("La solución real  es *****" + numeroAleatorio + "*****");

        return numeroAleatorio;
    }

}
