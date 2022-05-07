package com.practice;

public class ArmstrongNum {
    public static void main(String[] args){
        isArmstrong(153);

        for (int i = 100; i <= 1000; i++){  // printing all 3 digit Armstrong numbers using isArmstrong function
            if (isArmstrong(i)){
            System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){   // we can also just write "return sum == original"
//            System.out.println("It is Armstrong");
            return true;
        }
//        System.out.println("Not Armstrong");
        return false;
    }
}
