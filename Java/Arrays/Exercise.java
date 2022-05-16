
import java.util.Arrays;
public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 3));
    }

    // imagine array is not empty
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reversing an array using swap function
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (end > start){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // finding max element in array
    static int max(int[] arr){
        int maxElement = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    // finding max element in array with a range given
    static int maxRange(int[] arr, int start, int end){
        int maxElement = arr[start];
        for (int i = start; i < end; i++){
            if (arr[i] > maxElement){
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
