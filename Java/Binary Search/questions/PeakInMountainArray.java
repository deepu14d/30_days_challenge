// Find the peak index in the mountain array or bitonic array.
// https://leetcode.com/problems/find-peak-element/
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// Mountain array or Bitonic array - array in which values first increases then decreases
// Find peak element and array don't contain duplicate elements 
// We also don't know about target as we have to find peak element, largest element 
public class PeakInMountainArray{
  public static void main(String[] args){
    int[] arr = {1, 3, 5, 7, 8, 9, 4, 2, 1, 0};
    int ans = peakSearch(arr);
    System.out.println(ans);
  }

  public static int peakSearch(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while(end > start){
      int mid = start + (end-start)/2;
      if(arr[mid] > arr[mid+1]){   // we are in decreasing part of array, it maybe the answer but look at left
        end = mid;     // not mid-1 as it is also possible that current mid is the peak so we would not want go mid-1
      } else if(arr[mid] < arr[mid+1]){  // we are in ascending part of array
        start = mid + 1;    // because we are sure that mid+1 > mid so we can ignore mid as we want to find greater element
      }
    }

    /* at every point of time for start and end, they have the best possible answer till that time until there's only one value and when only one item remaining, then it's the best possible answer */
    
    return arr[start];  // return start or end as both are (equal) at same element in the ending 
  }
}