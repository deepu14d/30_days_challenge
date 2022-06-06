// Find the peak index in the mountain array or bitonic array.
// https://leetcode.com/problems/find-peak-element/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class mountainArray {
    public static void main(String[] args){
        int[] arr = {-1, 11, 23, 34, 45, 77, 34, 23, 10};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (end > start){
            int mid = start + (end-start)/2;
            if (arr[mid+1] < arr[mid]){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}