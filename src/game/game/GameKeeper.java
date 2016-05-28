package game.game;

import game.game.breakers.PuzzleBreaker;
import game.game.creators.PuzzleCreator;

import java.util.Scanner;

/**
 * Created by Юля on 02.04.2016.
 */
public class GameKeeper {
    Scanner scanner = new Scanner(System.in);

    private int leftLimit;
    private int rightLimit;
    private PuzzleBreaker puzzleBreaker;
    private PuzzleCreator puzzleCreator;

    public GameKeeper(PuzzleCreator puzzleCreator, PuzzleBreaker puzzleBreaker,
                      int leftLimit, int rightLimit) {
        this.puzzleBreaker = puzzleBreaker;
        this.puzzleCreator = puzzleCreator;
        this.rightLimit = rightLimit;
        this.leftLimit = leftLimit;
    }

    public void play() {
        int attempt = puzzleBreaker.assumeNumber();
        int result = puzzleCreator.checkNumber(attempt);
        int attemptsNumber = 1;

        while (result != 0) {
            if (attemptsNumber != (rightLimit - leftLimit) / 2) {
                System.out.println("Probable number: " + attempt);
                if (result > 0) {
                    System.out.println("Secret number is bigger.");
                } else {
                    if (result < 0) {
                        System.out.println("Secret number is smaller.");
                    }
                }
                attempt = puzzleBreaker.assumeNumber(result);
                result = puzzleCreator.checkNumber(attempt);
                attemptsNumber++;
            } else {
                System.out.println("All attempts are used.");
            }
        }
        if ((attemptsNumber <= (rightLimit - leftLimit) / 2) && (result == 0)) {
            System.out.println("Congratulations!!! The number was: " + attempt);
        }
    }

}
