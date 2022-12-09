// Magic Number is number we get when binary representation of a number will be divided by 5^1 with increasing powers going left side starting from LSB

public class MagicNumber {
    public static void main(String[] args){
        int n=4;
        int ans=0;
        int base=5;

        while(n>0){
            int last = n&1;
            n = n >> 1;
            ans = ans + last * base;
            base = base*5;
        }
        System.out.println(ans);
    }
}
