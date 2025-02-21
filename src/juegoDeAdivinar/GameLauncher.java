package juegoDeAdivinar;

public class GameLauncher {
    public static void main(String[] args) {
        GuessGame guessg = new GuessGame();
        int aleatorio = guessg.solucionNumero();
        guessg.startGame(aleatorio);
    }
}