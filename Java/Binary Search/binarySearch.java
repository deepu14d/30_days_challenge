public class binarySearch {
    public static void main(String[] args){
        int[] arr = {13, 34, 45, 56, 65, 77, 89, 90};  // array should be sorted
        int target = 65;
        System.out.println(binSearch(arr, target));
    }


    static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(end >= start){
            int mid = start + (end - start)/2;
            if (arr[mid] > target){
                end = mid  - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
