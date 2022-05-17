
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {19, 13, 14},
                {15, 16},
                {17, 18, 12, 20}
        };
        int target = 12;

        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(min(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

// *********************************************************************************** //
    static int min(int[][] arr){
        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
