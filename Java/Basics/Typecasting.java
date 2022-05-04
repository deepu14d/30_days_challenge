package com.deepanshu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        System.out.println("Starting");
        Scanner input = new Scanner(System.in);
        // Implicit typecasting
        float num = input.nextInt();  //taking integer value but java will typecast it automatically into float
        System.out.println(num);

        // Explicit typecasting
        int num2 = (int) (67.56f); //giving a float value but typecasting it into int explicitly
        System.out.println(num2);

        // Automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a);  // byte can store values only upto 256 so it's give output as 257%256 = 1
        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int r = x*y / z;  // here byte values get automatically converted to int as destination int is greater than source byte
        System.out.println(r + "is the result");

        int number = 'A';
        System.out.println(number);   // string is automatically converted to int based on the ASCII table

        System.out.println("नमस्ते");  // Java follows unicode so it allows almost all languages and emojis too, not just english

        /* Rules -
        1. automatically promotes each byte, short or char operand to int when evaluating an expression.
        2. If one operand is a long , float or double the whole expression is promoted to long , float or double respectively.
         */

        // When there are multiple types, then all the others will be converted to the biggest one.

    }
}
