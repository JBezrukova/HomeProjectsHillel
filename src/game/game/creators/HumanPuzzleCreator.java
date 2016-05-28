package game.game.creators;

import java.util.Scanner;

/**
 * Created by Юля on 02.04.2016.
 */
public class HumanPuzzleCreator implements PuzzleCreator {

    private int leftLimit;
    private int rightLimit;
    private Scanner scanner = new Scanner(System.in);

    public HumanPuzzleCreator(int leftLimit, int rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
        System.out.println("You have to come up with a number.If breaker's probable number will be equals enter \"0\", if bigger - \"-1\", if smaller - \"1\"");
    }

    @Override
    public int checkNumber(int number) {
        System.out.println("Check the number: ");
        return scanner.nextInt();
    }
}
