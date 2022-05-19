
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 23, 123, 256, 17, 12357, -1265};
        System.out.println(findNumbers(arr));
    }

    // function to check number of numbers with even numbers of digits
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (checkEven(nums[i])){
                count++;
            }
        }
        return count;
    }

    // function to check number of digits in a number
    static int numberOfDigits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            int rem = num/10;
            num = rem;
            count++;
        }
        return count;
    }

    // function to check number with even number of digits
    static boolean checkEven(int num){
        int numberOfDig = numberOfDigits(num);
        if (numberOfDig % 2 == 0){
            return true;
        }
        return false;
    }
}