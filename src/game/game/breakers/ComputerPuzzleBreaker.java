package game.game.breakers;

/**
 * Created by Юля on 02.04.2016.
 */
public class ComputerPuzzleBreaker implements PuzzleBreaker {
    private int leftLimit;
    private int rightLimit;

    public ComputerPuzzleBreaker(int leftLimit, int rightLimit) {
        this.leftLimit = leftLimit;
        this.rightLimit = rightLimit;
    }

    @Override
    public int assumeNumber() {
        int assumeNumber = (rightLimit + leftLimit) / 2;
        return assumeNumber;
    }

    @Override
    public int assumeNumber(int result) {
        if (result > 0) {
            leftLimit = assumeNumber();
        } else {
            rightLimit = assumeNumber();
        }
        return assumeNumber();
    }
}
