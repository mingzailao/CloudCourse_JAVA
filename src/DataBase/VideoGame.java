package DataBase;

/**
 * Created by apple on 15/12/14.
 */
public class VideoGame extends Item {
    private  int numPlayers;

    public VideoGame(String title, String comments, boolean gotIt, String artist, int playingTime, int numPlayers) {
        super(title, comments, gotIt, artist, playingTime);
        this.numPlayers = numPlayers;
    }

    @Override
    public void print() {
        System.out.print("VideoGame : ");
        super.print();
    }

}
