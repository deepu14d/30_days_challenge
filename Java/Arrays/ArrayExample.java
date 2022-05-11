
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] rollNo = {12, 23, 34, 45};
        System.out.println(rollNo[2]);

        // MULTIDIMENSIONAL ARRAYS - array of arrays

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8}
//        };
//        for (int row=0; row < arr.length; row++){
//            for (int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//        }

        int[][] multiDim = new int[3][2];
        // taking inputs
        for (int row=0; row < multiDim.length; row++){
            for (int col=0; col < multiDim[row].length; col++){
                multiDim[row][col] = in.nextInt();
            }
        }
        // output
        for (int row=0; row < multiDim.length; row++){
            for (int col=0; col < multiDim[row].length; col++){
                System.out.print(multiDim[row][col] + " ");
            }
            System.out.println();
        }

        for (int row=0; row < multiDim.length; row++){
            System.out.println(Arrays.toString(multiDim[row]));
        }

    }
}
