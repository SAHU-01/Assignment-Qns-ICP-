package com.company;

public class qn11 {
    public static void main(String args[])
    {
        int sum1=0,sum2=0;
        for(int i=1;i<=100;i++)
        {
            sum2=sum2+i;
            sum1=sum1+i*i;
        }
        int diff=(sum2*sum2)-sum1;
        System.out.println("Difference= "+diff);
    }
}
