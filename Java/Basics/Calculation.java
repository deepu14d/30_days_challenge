import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){

        while(true) {
            System.out.print("Enter the operator: ");
            Scanner input = new Scanner(System.in);
            int result = 0;
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {

                System.out.println("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (op == '%') {
                    result = num1 % num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
            } else if (op == 'x' || op == 'X' ){
                break;
            }
            else {
                System.out.println("Invalid operation.\nPress x if u want to exit");
            }
        System.out.println("The result is concluded as: " + result);
        }
    }
}
