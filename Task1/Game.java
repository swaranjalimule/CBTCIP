package task1;
import java.util.Random;

public class Game {
    private int min;
    private int max;
    private Random random;

    public Game(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public int newGame() {
        return random.nextInt(max - min + 1) + min;
    }
}




