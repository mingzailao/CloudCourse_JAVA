package DataBase;

/**
 * Created by apple on 15/12/13.
 */
public class Item {
    private String title;
    private String comments;
    private boolean gotIt;
    private String artist;
    private int playingTime;

    public String getTitle() {
        return title;
    }

    public String getComments() {
        return comments;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public Item(String title, String comments, boolean gotIt, String artist, int playingTime) {
        super();
        this.title = title;
        this.comments = comments;
        this.gotIt = gotIt;
        this.artist = artist;
        this.playingTime = playingTime;
    }

    public void print() {
        System.out.println(title+" : "+artist);
    }
}
