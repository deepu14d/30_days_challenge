package com.deepanshu;

import java.util.Scanner;

public class Adding2Num {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        float num2 = input.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of numbers provided is: " + sum);
    }
}
