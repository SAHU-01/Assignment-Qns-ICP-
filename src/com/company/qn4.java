package com.company;

import java.util.Scanner;
import java.util.*;
public class qn4 {
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three integers ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        int no3 = sc.nextInt();
        for( i=no1; i<=no2;i+=no3)
        {
            System.out.println(i);
        }
    }
}