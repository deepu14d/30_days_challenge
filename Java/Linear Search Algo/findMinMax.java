public class findMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 23, 13, -3, 2, 87, 100};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
// *************************************************************************************** //
    static int min(int[] arr){
        int minElement = arr[0];
        for (int i=1; i < arr.length; i++){
            if(minElement > arr[i]){
                minElement = arr[i];
            }
        }
        return minElement;
    }

// *************************************************************************************** //
    static int max(int[] arr){
        int maxElement = arr[0];
        for (int i=1; i < arr.length; i++){
            if(maxElement < arr[i]){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
