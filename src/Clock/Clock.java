package Clock;

import Display.Display;

/**
 * Created by apple on 15/12/13.
 */
public class Clock{
    Display minite=new Display(60);
    Display hour=new Display(24);
    Clock(){

    }
    public void start(){
        while(true) {
            minite.increase();
            if (minite.getValue() == 0) {
                hour.increase();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minite.getValue());
        }
    }
    public static void main(String[] args){
        Clock clock=new Clock();
        clock.start();
    }
}
