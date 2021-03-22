package com.company;

public class function_growth {
    public static void main(String args[])
    {
        int i=16;
        System.out.println("   logN              N           NlogN        N^2        N^3             2^N");
        while(i<2048)
        {
            double l=Math.log(i);
            System.out.println(l + " \t" + i +" \t" + (l*i) + " \t" + (i*i) + " \t" + (i*i*i) + " \t" +Math.pow(2,i));
            i=i*2;
        }
    }
}
