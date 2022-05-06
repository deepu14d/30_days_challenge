package com.deepanshu;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        System.out.println(a);
        while (count <= n){
            int temp = a+b;
            a = b;
            b = temp;
            System.out.println(a);
            count++;
        }
        System.out.println("\nThe fibonacci number at position " + n + " is " + a);
    }
}
