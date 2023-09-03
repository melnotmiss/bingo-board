 //Se encarga de generar cartones de bingo validos para los jugadores
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneradorCarton {
    public static int[][] generateCard() {
        int rows = 5;
        int columns = 5;
        int maxNumber = 75;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers); // Mezclar los números

        int[][] card = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                card[i][j] = numbers.get(i * columns + j);
            }
        }

        return card;
    }
}

