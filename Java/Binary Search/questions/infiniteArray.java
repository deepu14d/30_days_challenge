// Find position of an elemeent in a sorted array of infinite numbers
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteArray {
    public static void main(String[] args){
        int[] arr = {12, 23, 34, 35, 45, 56, 67, 78, 79, 89, 90, 100, 103, 122, 145};
        int target = 100;
        ans(arr, target);
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(arr[end] < target) {
            int newStart = end + 1;
            end = (newStart*2) + 1;
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end){

        int result = -1;
        while (start <=  end){
            int mid = start + (end-start)/2;
            if (arr[mid] > target){
                end = mid - 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return result;
    }
}
