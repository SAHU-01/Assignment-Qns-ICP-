package com.company;
import java.util.Scanner;
public class qn13 {
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enyer number");
        int n= sc.nextInt();
        while(n>0)
        {
            int d=n%10;
            System.out.println("Digit " + d+ " Extracted !");
            sum+=d;
            n=n/10;
        }
        if(sum%9==0)
            System.out.println("Number divisible by 9");
        else
            System.out.println("Number  not divisible by 9");

    }
}
