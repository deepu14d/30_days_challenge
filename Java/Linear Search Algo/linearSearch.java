
// In Arrays
class linearSearch {
    public static void main(String[] args) {

        // array search
        int[] arr = {2, 3, 412, 12, 54, 1, 90};
        int target = 54;
        System.out.println(search(arr, target));
        System.out.println(search2(arr, target));
        System.out.println(searchInRange(arr, target, 2, 5));
    }

// ********************************************************************************************** //
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

// *********************************************************************************************** //
    static boolean search2(int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }

        for (int element: arr){       // using forEach loop
            if (element == target){
                return true;
            }
        }
        return false;
    }

// ********************************************************************************************** //
    static int searchInRange (int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}