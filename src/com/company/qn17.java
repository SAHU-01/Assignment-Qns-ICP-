package com.company;

public class qn17 {
    public static void main(String args[])
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j<= 10; j++)
            {
                if (i % j == 0 || j % i == 0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
                System.out.println(i);
            }
    }
}
