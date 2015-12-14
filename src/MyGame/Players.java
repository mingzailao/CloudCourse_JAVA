package MyGame;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by apple on 15/12/14.
 */
public class Players {
    private HashMap<String,Player> players=new HashMap<String,Player>();

    public void addPlayer(String playername,Player player){
        players.put(playername,player);
    }
    public Player chosePlayer(String playername){
        Player ret=null;
        ret=players.get(playername);
        return ret;
    }

}
