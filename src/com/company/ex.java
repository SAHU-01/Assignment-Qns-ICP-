package com.company;
import java.util.Scanner    ;
public class ex
{
    public static void main (String[] args)
    {
        int t,a,b ;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i=0; i<t;i++)
        {
            a= sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
