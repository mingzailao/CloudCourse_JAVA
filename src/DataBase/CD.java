package DataBase;

/**
 * Created by apple on 15/12/13.
 */
public class CD extends Item {

    private int numOfTracks;


    public CD(String title, String comments, boolean gotIt, String artist, int playingTime, int numOfTracks) {
        super(title, comments, gotIt, artist, playingTime);
        this.numOfTracks = numOfTracks;
    }

    public static void main(String[] args){

    }

    public void print() {
        System.out.println("CD:"+super.getTitle()+" : "+super.getComments());
    }
}
