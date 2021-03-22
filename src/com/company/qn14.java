package com.company;
import java .util.Scanner;
public class qn14 {
    public static void main(String args[])
    {
        int max=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++) {
            double p = Math.pow(2, i);
            if (p <= n)
            {
                if (i >= max)
                    max = i;

            }
        }
        System.out.println("power: "+max);
    }
}
