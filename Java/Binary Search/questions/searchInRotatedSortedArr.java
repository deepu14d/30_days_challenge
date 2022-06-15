// Search In Rotated sorted array
// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class searchInRotatedSortedArr {
    public static void main(String[] args){
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target));
    }


    static int search(int[] arr, int target){    // main search using binary search and pivot
        int pivot = findPivot(arr);

        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (arr[0] <= target){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){  //binary search
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] < target){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){   // finding the largest number
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start+ (end-start)/2;

            if (end > mid && arr[mid] >   arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}