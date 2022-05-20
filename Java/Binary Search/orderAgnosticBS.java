
/* Order Agnostic Binary Search is used when we don't know whether the given array is sorted in ascending or descending order */

public class orderAgnosticBS {
    public static void main(String[] args){
        int[] list = {12, 23, 34, 45, 56, 67, 78, 90, 100};
        int target = 90;
        int[] list2 = {100, 90, 78, 67, 56, 45, 34, 23, 12};
        System.out.println(orderAgnosticBS(list, target));  // ascending order
        System.out.println(orderAgnosticBS(list2, target));  // descending order
    }

    static int orderAgnosticBS(int[] list, int target){
        int start = 0;
        int end = list.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == target) {
                return mid;
            }
            if (list[start] < list[end]) {    // for ascending
                if (target < list[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {                        // for descending
                if (target > list[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

/*
        // for ascending
        if (list[start] < list[end]){
            while(end >= start){
                int mid = (start + end)/2;
                if(target > list[mid]){
                    start = mid + 1;
                }
                else if(target < list[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }


        // for descending
        if (list[start] > list[end]){
            while(end >= start){
                int mid = (start + end)/2;
                if(target < list[mid]){
                    start = mid + 1;
                }
                else if(target > list[mid]){
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
        }

        */
