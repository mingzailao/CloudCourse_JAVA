package Display;


/**
 * Created by apple on 15/12/13.
 */
public class Display {
    private int value=0;
    private int limit;
    private static int step=1;//类变量
    Display(){

    }
    public Display(int limit){
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
    public static void f()//static 函数相当于类函数,
    {
//        value++;//不能对类成员操作
        step++;//但是可以对类变量进行操作
    }
    public static void main(String[] args){
//        Display d=new Display(24);
//        for(;;){
//            d.increase();
//            System.out.println(d.getValue());
//        }
        Display d1=new Display(10);
        Display d2=new Display(20);
        d1.increase();
        System.out.println(d1.getValue());
        System.out.println(d2.getValue());
        System.out.println(d1.step);
        System.out.println(d2.step);
        d1.step=2;
        System.out.println(d1.step);
        System.out.println(d2.step);
    }
}
