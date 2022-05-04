package com.deepanshu;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        System.out.println("Enter temperature in Celsius: ");
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();
        float fahrenheit = (float)(celsius*1.8) + 32;
        System.out.println("The temperature " + celsius + " celsius is " + fahrenheit + " fahrenheit." );
    }
}
