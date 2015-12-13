package DataBase;

import java.util.ArrayList;

/**
 * Created by apple on 15/12/13.
 */
public class DataBase {
    private ArrayList<Item> listItem=new ArrayList<Item>();

    public void add(Item item){
        listItem.add(item);
    }
    public void list(){
        for (Item item :
                listItem) {
            item.print();
        }
    }
    public static void main(String[] args){
        DataBase db=new DataBase();
        db.add(new CD("abc","...",false,"abc",50,10));
        db.add(new CD("def","...",false,"def",100,20));
        db.add(new DVD("asd","...",false,"asd",1000,"Smith"));
        db.add(new mp3("mp3","mp3",false,"mp3",100,30,"www.baidu.com"));
        db.list();
    }
}
