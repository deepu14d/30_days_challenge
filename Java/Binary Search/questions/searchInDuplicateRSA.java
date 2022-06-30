// Rotated binary search with duplicate arrays
// Search In Rotated sorted array II - LeetCode
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/submissions/

public class searchInDuplicateRSA {
    public static void main(String[] args){
        int[] arr= {2,5,6,0,0,1,2,2};
        int target = 5;
        System.out.println(result(arr, target));
    }

    static boolean result(int[] arr, int target){
        int ans = search(arr, target);

        if(ans == -1){
            return false;
        } else {
            return true;
        }
    }

    static int search(int[] arr, int target){
        int pivot = findPivotInDuplicates(arr);

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(target == arr[pivot]){
            return pivot;
        }
        if(arr[0] <= target){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if(arr[mid] < target){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotInDuplicates(int[] arr){  // finding the largest element so that we can divide array in 2 sub-arrays
        int start = 0;
        int end = arr.length - 1;

        while(end >= start){
            int mid = start+(end-start)/2;

            if (end > mid && arr[mid] > arr[mid+1]){   // if mid-element is larger than next one (last mid not considered)
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){  // if previous element is larger than mid-element (first mid not considered)
                return mid-1;
            }

            // In case of duplicates, if first element, last element and mid-element are same then remove the first and last one
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // start++
                // end --


                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start ++;
                // check if end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}

//class Solution {
//    public boolean search(int[] nums, int target){
//
//        int start=0;
//        int end=nums.length-1;
//
//        while(end>=start){
//            int mid=start+(end-start)/2;
//
//            if(nums[mid]==target) {
//                return true;
//            }
//
//            if(nums[mid] > nums[start]){
//                if(target >= nums[start] && target < nums[mid]){
//                    end=mid;
//                } else {
//                    start=mid+1;
//                }
//            }
//            else if(nums[mid] < nums[start]){
//                if(target > nums[mid] && target < nums[start]){
//                    start=mid+1;
//                } else {
//                    end=mid;
//                }
//            }
//            else {
//                start++;
//            }
//        }
//        return false;
//    }
//}

