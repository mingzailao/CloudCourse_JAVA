package Clock;

/**
 * Created by apple on 15/12/13.
 */
public class Display {
    private int value=0;
    private int limit;
    Display(){

    }
    Display(int limit){
        this.limit=limit;
    }
    public boolean increase(){

        value++;
        if(value==limit){
            value=0;
            return true;
        }
        return false;

    }
    public int getValue(){
        return value;
    }
    public static void main(String[] args){
        Display d=new Display(24);
        for(;;){
            d.increase();
            System.out.println(d.getValue());
        }
    }
}
