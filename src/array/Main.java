package array;

import java.util.Scanner;

/**
 * Created by apple on 15/12/11.
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] data={1,2,3,4,5,6,7,8,9};
        int x=in.nextInt();
        int loc=-1;
        for (int i=0;i<data.length;i++)
        {
            if(x==data[i])
            {
                loc=i;
                break;
            }
        }
        if(loc>-1)
        {
            System.out.println(x+"是第"+(loc+1)+"个");
        }
        else
        {
            System.out.println(x+"不在其中");
        }
    }
}
