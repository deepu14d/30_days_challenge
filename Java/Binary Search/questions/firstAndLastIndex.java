// Finding the first and last position(index) of an element in sorted array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class firstAndLastIndex {
    public static void main (String[] args) {
        int[] nums = {12, 23, 34, 34, 34, 45, 45, 45, 56, 67};
        int target = 34;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }

    static int search(int[] nums, int target, boolean checkStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if (target > nums[mid]){
                start = mid+1;
            }
            else if (nums[mid] > target){
                end = mid -1;
            }
            else {
                result = mid;
                if (checkStartIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
