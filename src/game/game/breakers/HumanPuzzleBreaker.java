package game.game.breakers;

import java.util.Scanner;

/**
 * Created by Юля on 02.04.2016.
 */
public class HumanPuzzleBreaker implements PuzzleBreaker {

    private Scanner scanner = new Scanner(System.in);

    public HumanPuzzleBreaker(int leftLimit, int rightLimit) {

    }

    @Override
    public int assumeNumber() {
        int number = scanner.nextInt();
        return number;

    }

    @Override
    public int assumeNumber(int result) {
        return assumeNumber();
    }
}
