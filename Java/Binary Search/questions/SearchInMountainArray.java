/* The target element maybe in increasing number or decreasing numbers in the mountain array. We have to use order agnostic binary search based on the numbers. */
/*
First we'll find the Peak element.
then BS for start=0, end=peak
and BS for start=peak+1, end=arr.length - 1          // orderAgnosticBS
*/   // this way we can search the whole array in logN time complexity

public class SearchInMountainArray {
    public static void main(String[] args){
        int[] arr = {2, 3, 4, 6, 7, 9, 10, 12, 13, 8, 5, 1, -2};
        int target = -2;
        int peak = peakSearch(arr);
        int ans = orderAgnosticBS(arr, target, 0, peak);
        if (ans == -1){
            ans = orderAgnosticBS(arr, target, peak+1, arr.length-1);
        }
        System.out.println(ans);
    }

    public static int peakSearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(end > start){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else if (arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }

    public static int orderAgnosticBS(int[] arr, int target, int start, int end){
        if(arr[end]>arr[start]){
            while(end>=start){
                int mid = start + (end-start)/2;
                if(arr[mid] > target){
                    end = mid - 1;
                } else if(arr[mid] < target){
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        else {
            while(end>=start){
                int mid = start + (end-start)/2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}