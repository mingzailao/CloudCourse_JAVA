package MyGame;

import MyGame.Game;

/**
 * Created by apple on 15/12/14.
 */
public class Handler {
    protected Game game;

    public Handler(Game game) {
        this.game = game;
    }

    public void doCmd(String word){

    }
    public boolean isBye(){
        return false;
    }
}
