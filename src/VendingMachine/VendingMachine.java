package VendingMachine;

/**
 * Created by apple on 15/12/13.
 */
public class VendingMachine {
    private int price=80;
    private int balance=0;
    private int total=0;
    VendingMachine(){

    }
    VendingMachine(int price){
        this.price=price;
    }
    void showPrompt(){
        System.out.println("Welcome");
    }
    void insertMoney(int amount){
        balance=balance+amount;

    }
    void showBalance(){
        System.out.println(balance);
    }
    void getFood(){
        if(balance>=price){
            System.out.println("Here you are");
            balance=balance-price;
            total=total+price;
        }
    }
    public static void main(String[] args){
        VendingMachine vm=new VendingMachine();
        vm.showPrompt();;
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        vm.showBalance();
        VendingMachine vm1=new VendingMachine(40);
        vm1.showPrompt();
        vm1.showBalance();
        vm1.insertMoney(100);
        vm1.getFood();
        vm1.showBalance();
    }
}
