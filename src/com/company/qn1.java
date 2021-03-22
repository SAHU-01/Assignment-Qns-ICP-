package com.company;
import java.util.*;
public class qn1 {
    public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a message !");
       String m=sc.next();
       int i=1;
       while(i<=10)
       {
           if(i==1)
               System.out.println(i+"st "+m);
           else if(i==2)
               System.out.println(i+"nd "+m);
           else if(i==3)
               System.out.println(i+"rd "+m);
           else
               System.out.println(i+"th "+m);
           i++;

       }
    }

}
