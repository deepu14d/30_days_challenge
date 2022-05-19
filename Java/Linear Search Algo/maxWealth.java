
// https://leetcode.com/problems/richest-customer-wealth/

public class maxWealth {
    public static void main(String[] args){
        int[][] arr = {{12,23,12,2},
                {23, 12,1,3}};
        System.out.println(maximumWealth(arr));
    }

    public static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int person=0; person < accounts.length; person++){
            int sum = 0;
            for (int amount=0; amount < accounts[person].length; amount++){
                sum += accounts[person][amount];
            }
            if (max < sum){
                max = sum;
            }
        }
        return max;
    }
}
