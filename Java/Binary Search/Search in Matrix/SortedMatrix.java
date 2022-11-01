// The matrix is completely sorted, find the target element
import java.util.Arrays;

public class SortedMatrix{
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int target = 10;
        int[] answer = search(matrix, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows==1){  // if we have only 1 row
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int colStart = 0;
        int colEnd = cols - 1;
        int colMid = colStart + (colEnd - colStart)/2;  // colMid not inside while because we only need to see it one time only
        int rowStart = 0;
        int rowEnd = rows - 1;

        // run the loop till 2 rows are remaining
        while(rowStart < (rowEnd - 1)){  // while this is true, it means we have 2+ rows
            int rowMid = rowStart + (rowEnd - rowStart)/2;
            if(matrix[rowMid][colMid] == target){
                return new int[] {rowMid, colMid};
            } else if(matrix[rowMid][colMid] > target){  // means we can ignore rows below
                rowEnd = rowMid;
            } else {   // (matrix[rowMid][colMid] < target)  // we can ignore rows above
                rowStart = rowMid;
            }
        }

        // after above while loop, we will have only 2 rows left
        // Now we have to check if target is in that midCol of 2 rows
        if(matrix[rowStart][colMid] == target){
            return new int[] {rowStart, colMid};
        }
        if(matrix[rowStart+1][colMid] == target){
            return new int[] {rowStart+1, colMid};
        }

        // Now, if the target is not even in that midCol then check in remaining 4 parts
        // check in 1st part
        if(matrix[rowStart][colMid-1] >= target){
            return binarySearch(matrix, rowStart, 0, colMid-1, target);
        }
        // check in 2nd part
        if(matrix[rowStart][colMid+1] <= target && matrix[rowStart][cols-1] >= target){  // AND condition to see that element should be in that row, as target can be in next row also and for next row we have different checks
            return binarySearch(matrix, rowStart, colMid+1, cols-1, target);
        }
        // check in 3rd part
        if(matrix[rowStart+1][colMid-1] >= target){
            return binarySearch(matrix, rowStart+1, 0, colMid-1, target);
        }
        // check in 4th part
        if(matrix[rowStart+1][colMid+1] <= target && matrix[rowStart+1][cols-1] >= target){
            return binarySearch(matrix, rowStart+1, colMid+1, cols-1, target);
        }
        return new int[] {-1, -1};
    }


    // searching in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[] {row, mid};
            } else if(matrix[row][mid] > target){
                cStart = mid+1;
            } else {
                cEnd = mid-1;
            }
        }
        return new int[] {-1,-1};
    }
}
