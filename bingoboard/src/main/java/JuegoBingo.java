//Clase principal donde se inicializa y se ejecuta el juego 

import java.util.ArrayList;
import java.util.List;

public class JuegoBingo {
    private final MaquinaBingo bingoMachine;
    private final List<Jugador> players;

    public JuegoBingo() {
        bingoMachine = new MaquinaBingo();
        players = new ArrayList<>();
        // Agregar jugadores a la lista (esto debe completarse)
        // players.add(new Player("Jugador1", CardGenerator.generateCard()));
        // players.add(new Player("Jugador2", CardGenerator.generateCard()));
        // ...
    }

    public void play() {
        // Lógica del juego (esto debe completarse)
        while (!gameOver()) {
            int drawnNumber = bingoMachine.drawNumber();
            players.forEach((player) -> {
                player.markNumber(drawnNumber);
            });
        }
    }

    public void checkWinners() {
        // Verificar ganadores y anunciar resultados (esto debe completarse)
        players.forEach((player) -> {
            if (player.hasBingo()) {
                System.out.println(player.getName() + " ha ganado con un BINGO!");
            } else if (player.hasLine()) {
                System.out.println(player.getName() + " tiene una línea completa.");
            }
        });
    }

    private boolean gameOver() {
        // Definir la condición de finalización del juego (esto debe completarse)
        // Por ejemplo, cuando un jugador tiene un bingo o cuando se han extraído todos los números.
        return false;
    }
}
