package DataBase;

/**
 * Created by apple on 15/12/13.
 */
public class Mp3 extends CD {

    private String webSite;

    public Mp3(String title, String comments, boolean gotIt, String artist, int playingTime, int numOfTracks, String webSite) {
        super(title, comments, gotIt, artist, playingTime, numOfTracks);
        this.webSite = webSite;
    }

    public void print(){
        System.out.println("mp3 : "+super.getTitle()+" : "+super.getComments()+" : "+webSite);
    }

}
