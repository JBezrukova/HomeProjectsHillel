package game.game;

import game.game.breakers.HumanPuzzleBreaker;
import game.game.creators.HumanPuzzleCreator;

/**
 * Created by Юля on 02.04.2016.
 */
public class Game {
    public static void main(String[] args) {
        GameKeeper gameKeeper = new GameKeeper(new HumanPuzzleCreator(0, 50), new HumanPuzzleBreaker(0, 50), 0, 50);
        gameKeeper.play();
    }
}
