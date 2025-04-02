package basics;/*
Here we are doing a selection sort and we are trying to implement multiple methods  for each task like swap and finding
the max numbers.
 */
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
     int [] arr = {1};
     selectionSort(arr);
     System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        if (arr.length == 1 || arr == null){
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
               if(arr[j] < arr[j-1]){
                   swapArrValues(arr,j,j-1);
                   swapped = true;
               }
               if(!swapped){   //if no swapped happened
                   break;
               }
            }
        }
    }
    public static void swapArrValues(int[] arr, int first, int second) {
        int temp=  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
