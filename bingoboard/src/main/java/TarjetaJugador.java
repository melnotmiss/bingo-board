public class TarjetaJugador {
    private final int[][] numbers;
    private final boolean[][] marked;

    public TarjetaJugador(int[][] numbers) {
        this.numbers = numbers;
        marked = new boolean[numbers.length][numbers[0].length];
    }

    public void markNumber(int number) {
        // Encontrar y marcar el número en la matriz 'marked'
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == number) {
                    marked[i][j] = true;
                    return; // Salir del bucle cuando se marca el número
                }
            }
        }
    }

    public boolean hasLine() {
        // Verificar si hay una línea completa en el cartón
        for (boolean[] marked1 : marked) {
            boolean lineComplete = true;
            for (int j = 0; j < marked1.length; j++) {
                if (!marked1[j]) {
                    lineComplete = false;
                    break;
                }
            }
            if (lineComplete) {
                return true;
            }
        }
        return false;
    }

    public boolean hasBingo() {
        // Verificar si hay un bingo completo en el cartón
        for (boolean[] marked1 : marked) {
            for (int j = 0; j < marked1.length; j++) {
                if (!marked1[j]) {
                    return false; // Si hay un número no marcado, no hay bingo
                }
            }
        }
        return true; // Si todos los números están marcados, hay bingo
    }
}

