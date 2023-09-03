//Clase que simula la tombola donde estan los numeros del juego

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaquinaBingo {
    private List<Integer> numbers;
    private Random random;

    public MaquinaBingo() {
        initializeBingoMachine();
    }

    private void initializeBingoMachine() {
        numbers = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            numbers.add(i);
        }
        random = new Random();
    }

    public int drawNumber() {
        if (numbers.isEmpty()) {
            throw new IllegalStateException("No quedan más números en el bombo.");
        }

        int index = random.nextInt(numbers.size());
        int drawnNumber = numbers.remove(index);
        return drawnNumber;
    }
}
