//Clase que representa a los jugadores

public class Jugador {
    private final String name;
    private final TarjetaJugador card;
    private boolean hasLine;
    private boolean hasBingo;

    public Jugador(String name, int[][] cardNumbers) {
        this.name = name;
        this.card = new TarjetaJugador(cardNumbers);
        this.hasLine = false;
        this.hasBingo = false;
    }

    public String getName() {
        return name;
    }

    public TarjetaJugador getCard() {
        return card;
    }

    public boolean hasLine() {
        if (!hasLine) {
            hasLine = card.hasLine();
        }
        return hasLine;
    }

    public boolean hasBingo() {
        if (!hasBingo) {
            hasBingo = card.hasBingo();
        }
        return hasBingo;
    }

    public void markNumber(int number) {
        card.markNumber(number);
        if (card.hasLine()) {
            hasLine = true;
        }
        if (card.hasBingo()) {
            hasBingo = true;
        }
    }
}
