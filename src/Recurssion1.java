public class Recurssion1 {
    //Fibonacci
    public static int fibonacciSeriesRec(int n) {
        //Base condition for recursive function here,

        if(n < 2){
            return n;
        }
        //the other one that will compute
      return fibonacciSeriesRec(n - 1) + fibonacciSeriesRec(n - 2);
    }
    //Factorial function
    public static int fact(int n){
        if(n <= 1) return 1;
        return n * fact(n-1);
    }
    //Binary search
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
//Sum of digits
    public static int sumOfDigits(int n){
        if(n==0) return 0;
        return (n%10) + sumOfDigits(n/10);
    }
    //Product of digits
    public static int prodOfDigits(int n){
        if(n%10 == n) return n;
        return (n%10) * prodOfDigits(n/10);
    }
    //Count number of zeroes in the number
    public static int countZeroes(int n){
    return helperForCountZeroes(n,0);
    }
    private static int helperForCountZeroes(int n, int c){
        if(n == 0) return c;
        int rem = n % 10;
        if(rem == 0) return helperForCountZeroes(n/10,c+=1);
        return helperForCountZeroes(n/10,c);
    }
    //Number of steps required to make number zero
    public static int numberOfSteps(int num){
        return numSteps(num, 0);
    }
    public static int numSteps(int num, int steps){
        if (num == 0) return steps;
        if (num % 2 == 0)
        {
            return numSteps(num/2,steps+=1);
        }
        return numSteps(num -1,steps+=1);
    }
    public static void main(String[] args) {
       // System.out.println(fibonacciSeriesRec(6));
        /*int arr [] = {1,2,3,4,6,41,67};
        int target = 41;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
         */
        /*int factAns= fact(5);
        System.out.println(factAns);
         */
        /*
        int sumOfDigitAns = sumOfDigits(1342);
        System.out.println(sumOfDigitAns);
        */
        /*
        int prodOfDigits = prodOfDigits(1342);
        System.out.println(prodOfDigits);
         */
        //System.out.println(countZeroes(300301));
        System.out.println(numberOfSteps(14));
    }
}
