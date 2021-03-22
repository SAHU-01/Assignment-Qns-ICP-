package com.company;
import java.util.*;
public class qn7 {
    public static void main(String args[])
    {
        double sum=0;
        System.out.println("Enter no of times random no is to be printed");
        System.out.println(args[0]);
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            double ran = Math.random() ;
             sum +=ran;
        }
        double average=sum/n;
        System.out.println("Average:"+average);
    }

}
