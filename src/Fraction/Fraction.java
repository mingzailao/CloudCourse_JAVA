package Fraction;

import java.util.Scanner;

/**
 * Created by apple on 15/12/13.
 */
public class Fraction{
    int fenzi;
    int fenmu;
    Fraction()
    {

    }
    Fraction(int fenzi,int fenmu)
    {
        this.fenzi=fenzi;
        this.fenmu=fenmu;
    }
    void print()
    {
        this.getsimple();
        if(fenzi!=fenmu)
            System.out.println(this.fenzi+"/"+this.fenmu);
        else
            System.out.println("1");
    }
    double toDouble()
    {
        double result=fenzi*1.0/fenmu;
        return result;
    }
    Fraction plus(Fraction r)
    {
        Fraction result=new Fraction();
        result.fenmu=fenmu*r.fenmu;

        result.fenzi=fenzi*r.fenmu+fenmu*r.fenzi;

//			this.getsimple();
        return result;

    }
    void getsimple()
    {
        int tmp;
        int m=fenmu,n=fenzi;

        while(m%n!=0)
        {
            tmp=n;
            n=m%n;
            m=tmp;
        }
        fenzi=fenzi/n;
        fenmu=fenmu/n;
    }
    Fraction multiply(Fraction f)
    {
        Fraction result=new Fraction();
        result.fenzi=fenzi*f.fenzi;
        result.fenmu=fenmu*f.fenmu;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

}