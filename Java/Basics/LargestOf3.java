package com.deepanshu;

// IfElse statement example

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args){
        System.out.println("Enter the numbers");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if ((num1>num2) && (num1>num3)) {
            System.out.println(num1 + " is the largest number.");
        }
        else if ((num2>num1) && (num2>num3)) {
            System.out.println(num2 + " is the largest number.");
        }
        else {
            System.out.println(num3 + " is the largest");
        }
    }
}

//max = num1;        // it is more optimal logic as less comparisons are being done and so less time complexity
//if (num2 > max){
//    max = num2;
//        }
//if (num3 > max){
//    max = num3;
//        }
//System,out.println(max + " is the meaximum number.")

// int max = Math.max(c, Math.max(a, b));
