package com.company;
import java.util.*;
public class qn2 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you have to print");
        System.out.println(args[0]);
        System.out.println("Enter a message !");
        String m=sc.next();
        int n=Integer.parseInt(args[0]);
        int i=1;
        while(i<=n)
        {
            if(i%10==1 && i% 100!=11)
                System.out.println(i+"st "+m);
            else if(i%10==2 && i%100!=12)
                System.out.println(i+"nd "+m);
            else if(i%10==3 && i%100!=13)
                System.out.println(i+"rd "+m);
            else
                System.out.println(i+"th "+m);
            i++;
        }
    }
}
