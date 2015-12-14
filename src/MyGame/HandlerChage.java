package MyGame;

/**
 * Created by apple on 15/12/14.
 */
public class HandlerChage extends Handler {

    public HandlerChage(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        game.changePlayer(word);
    }
}
