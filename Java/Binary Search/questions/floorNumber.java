/* Finding the floor value of given target number */
/* Floor element -- the biggest element that is less than or = target */

public class floorNumber {
    public static void main(String[] args){
        int[] arr = {12, 23, 34, 56};
        int target = 37;
        System.out.println(floorNum(arr, target));
    }

    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if (arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
