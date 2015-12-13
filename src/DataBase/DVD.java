package DataBase;

/**
 * Created by apple on 15/12/13.
 */
public class DVD extends Item {


    private String director;


    public DVD(String title, String comments, boolean gotIt, String artist, int playingTime, String director) {
        super(title, comments, gotIt, artist, playingTime);
        this.director = director;
    }

    public void print() {
        System.out.println("DVD: "+super.getTitle()+" : "+super.getComments());
    }
}
