package Coins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by apple on 15/12/13.
 */
public class Coin {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int amount=in.nextInt();
        Coin coin=new Coin();
        String name=coin.getName(amount);
        System.out.println(name);
    }
    private HashMap<Integer,String> coinnames=new HashMap<Integer,String>();
    public Coin(){
        this.coinnames.put(1,"penny");
        this.coinnames.put(10,"dime");
        this.coinnames.put(25,"quarter");
        this.coinnames.put(50,"half-dolar");
//        this.coinnames.put(50,"五毛");
//        System.out.println(coinnames.keySet().size());
//        System.out.println(coinnames);
        for (Integer k :
                coinnames.keySet()) {
            String s=coinnames.get(k);
            System.out.println(s);
        }
    }
    public String getName(int amount){
        if(coinnames.containsKey(amount)) {
            return coinnames.get(amount);
        }
        else{
            return "Not Found";
        }
    }

}
