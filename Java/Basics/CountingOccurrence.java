
import java.util.Scanner;
public class CountingOccurrence {
    public static void main (String[] args){
        System.out.println("Enter the string of numbers ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        System.out.println("Enter the number to count ");
        int numToCount = input.nextInt();
        int count = 0;

        while (num>0) {
            int rem = num % 10;
            if (rem == numToCount) {
                count++;
            }
            num /= 10;
        }

        System.out.println("The number of times " + numToCount + " have occurred is " + count);
    }
}