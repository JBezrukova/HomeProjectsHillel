package game.game.creators;

/**
 * Created by Юля on 02.04.2016.
 */
public class ComputerPuzzleCreator implements PuzzleCreator {

    private int puzzleNumber;

    public ComputerPuzzleCreator(int leftLimit, int rightLimit) {
        puzzleNumber = leftLimit + (int) (Math.random() * ((rightLimit - leftLimit) + 1));
    }

    @Override
    public int checkNumber(int number) {
        int result = Integer.compare(puzzleNumber, number);
        return result;
    }
}
