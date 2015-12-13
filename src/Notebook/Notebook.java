package Notebook;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by apple on 15/12/13.
 * 容器类
 */
class Value{
    private int i;
    public void set(int i){
        this.i=i;
    }
    public int get(){
        return i;
    }
    //override
    public String toString(){
        return ""+i;
    }
}
public class Notebook {
    //ArrayList of String(泛型类)是一种容器

    private ArrayList<String> notes=new ArrayList<String>();


    //添加借口
    public void add(String s){
        notes.add(s);

    }
    public void add(String s,int location){
        notes.add(location,s);
    }
    public int getSize(){
        return notes.size();
    }
    public String getNote(int index){
        return notes.get(index);
    }
    public void removeNote(int index){
        notes.remove(index);
    }
    public String[] list(){

        String[] a=new String[notes.size()];
//        for(int i=0;i<notes.size();i++){
//            a[i]=notes.get(i);
//        }
        notes.toArray(a);//ArrayList<String> 中的toArray函数可以直接实现上述功能
        return a;
    }
    public static void main(String[] args){
        Value v=new Value();
        v.set(10);
        System.out.println(v);
        HashSet<String> s=new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
//        for (String k:
//             s) {
//            System.out.println(k);
//        }
        System.out.println(s);
        System.out.println("----------------");
        ArrayList<String> a=new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("first");
//        for (String k:
//                a) {
//            System.out.println(k);
//        }
        System.out.println(a);


//        Notebook notebook = new Notebook();
//        notebook.add("first");
//        notebook.add("second");
//        notebook.add("third",1);
//        System.out.println(notebook.getSize());
//        System.out.println(notebook.getNote(1));
//        notebook.removeNote(1);
//        String[] a=notebook.list();
//        for (String s:a
//             ) {
//            System.out.println(s);
//        }
        //foreach 对于对象数组是不一样的
//        Value[] a=new Value[10];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=new Value();
//            a[i].set(i);
//        }
//        for (Value v :
//                a) {
//            System.out.println(v.get());
//            v.set(0);
//        }
//        for (Value v :
//                a) {
//            System.out.println(v.get());
//        }



        //对于ArrayList<String>呢?
//        ArrayList<String> a=new ArrayList<String>();
//        a.add("first");
//        a.add("second");
//        for (String s :
//                a) {
//            System.out.println(s);
//            s="a";
//        }
//        for (String s:
//             a) {
//            System.out.println(s);
//        }
//        int[] ia=new int[10];
//        for (int i = 0; i < ia.length; i++) {
//            ia[i]=i;
//        }
//        for (int k :
//                ia) {
//            System.out.println(k);
//        }
//        String[] a=new String[10];
//
//        for (int i = 0; i < a.length; i++) {
//            a[i]=""+i;
//        }
//        System.out.println(ia[0]+2);
//        System.out.println(a[0]+"a");
//        String s=null;
//        System.out.println(s.length());

    }
}
