public class Recurssion1 {
    public static int fibonacciSeriesRec(int n) {
        //Base condition for recursive function here,

        if(n < 2){
            return n;
        }
        //the other one that will compute
      return fibonacciSeriesRec(n - 1) + fibonacciSeriesRec(n - 2);
    }
    public static int binarySearch(int []arr,int target,int start, int end){
        //Base condition because the start value is greater than end value and the number has not been found.
        if(start  > end){
            return -1;
        }
        //the other one that will compute
        int mid = (start + end) - start/2;
        if (arr[mid] == target){
            return mid;
        }
        else if (target < arr[mid]){
            return binarySearch(arr,target,start,mid - 1);
        }
        return binarySearch(arr,target,mid + 1,end);
    }

    public static void main(String[] args) {
       // System.out.println(fibonacciSeriesRec(6));
        int arr [] = {1,2,3,4,6,41,67};
        int target = 41;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }
}
