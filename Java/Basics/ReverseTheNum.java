import java.util.Scanner;
public class ReverseTheNum {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = 0;

        while (num > 0){
            int rem = num % 10;
            result = result * 10 + rem;
            num /= 10;
        }
        System.out.println("The reverse of " + num + " is " + result );
    }
}
