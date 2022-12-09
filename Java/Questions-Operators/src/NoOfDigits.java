// finding number of digits in a number of any base, say 10 (decimal) or 2 (binary)

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 101010;
        int b = 2;
        int digits = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(digits);
    }
}
