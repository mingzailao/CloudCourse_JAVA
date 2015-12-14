package castle;

/**
 * Created by apple on 15/12/14.
 */
public class HandlerGo extends Handler {

    public HandlerGo(Game game) {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        game.goRoom(word);
    }
}
