package castle;

/**
 * Created by apple on 15/12/14.
 */
public class HandlerBye extends Handler {
    public HandlerBye(Game game) {
        super(game);
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
