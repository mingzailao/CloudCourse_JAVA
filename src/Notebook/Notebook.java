package Notebook;

import java.util.ArrayList;

/**
 * Created by apple on 15/12/13.
 * 容器类
 */
public class Notebook {
    //ArrayList of String(泛型类)是一种容器

    private ArrayList<String> notes=new ArrayList<String>();


    //添加借口
    public void add(String s){
        notes.add(s);

    }
    public int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return "";
    }
    public boolean removeNote(int index){
        return true;
    }
    public String[] list(){
        return new String[10];
    }
    public static void main(String[] args){
        Notebook notebook=new Notebook();
        notebook.add("first");
        notebook.add("second");
        System.out.println(notebook.getSize());
    }


}
