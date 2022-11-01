// We have a Matrix that is sorted column wise and row wise, find the target element

import java.util.Arrays;

public class RowColSortedMatrix {
    public static void main(String[] args){
        int[][] matrix = {
                {12, 23, 34, 45},
                {13, 24, 35, 46},
                {14, 25, 36, 47}
        };
        int target = 102;
        int[] answer = search(matrix, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] search(int[][] matrix, int target){
        int row = 0;  // we will start from first row but last col element means [0][matrix.length-1]
        int col = matrix.length - 1;
        while(row < matrix.length && col >= 0){  // condition 'll break if row value become more than given matrix length and col value become less than 0
            if(matrix[row][col] == target){
                return new int[] {row, col};
            } else if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return new int[] {-1, -1};
    }
}