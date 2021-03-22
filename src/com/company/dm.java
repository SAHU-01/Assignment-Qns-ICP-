package com.company;
import java.util.Scanner;
public class dm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int number=sc.nextInt();
        for(int i = 0; i < 3 * number; ++i)
        {
            for(int j = 0; j < number; ++j)
            {
                System.out.print("*") ;
            }

            System.out.println("\n");
        }

        for(int i = 0; i < number; ++i)
        {
            for(int j = 0; j < 4 * number; ++j)
            {
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }

}
