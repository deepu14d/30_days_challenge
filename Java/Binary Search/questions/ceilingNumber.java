/* Finding the ceiling value of the given target number */
/* Ceiling element -- the smallest element in array that is greater or = target */

public class ceilingNumber {
    public static void main(String[] args){
        int[] arr = {12, 23, 34, 45, 56};
        int target = 19;
        System.out.println(ceilingValue(arr, target));
    }

    static int ceilingValue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
