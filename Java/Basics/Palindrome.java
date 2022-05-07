package com.practice;
// Function implementation and Palindrome logic

public class Palindrome {
    public static void main(String[] args) {
        palindrome(853535358);
    }

    static void palindrome(int num){
        int rem = 0;
        int result = 0;
        int temp = num;
        while(num > 0) {
            rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }
        num = temp;
        if (result == num){
            System.out.println("It is a Palindrome number.");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }
}
