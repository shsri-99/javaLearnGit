
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Recurssion2 {
    //check whether array is sorted
    public  static boolean sorted(int [] arr , int index){
        if (index == arr.length - 1) return true;
        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }
    //linear search to find if target is found in array
    public static  boolean findTarget(int [] arr, int target){
        return linearSearch(arr, target,0);
    }
    public static boolean linearSearch(int [] arr,int target, int ind){
        if (ind == arr.length - 1) return false;
        return (arr[ind] == target || linearSearch(arr,target,ind+=1));
    }
    //Rotated search {4,5,6,7,1,2,3} kind of example.
    public static int rotatedSearch(int [] arr, int target, int s, int e){
        if (s > e) return -1;
        int m = s + (e-s)/2;
        if (arr[m]==target) return m;
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]){
               return rotatedSearch(arr,target,s,m-1);
            }
            else return rotatedSearch(arr,target,m+1,e);
        }
        if (target >=arr[m] && target <= arr[e]){
            return rotatedSearch(arr,target,m+1,e);
        }
        return rotatedSearch(arr, target,s,m-1);
    }
    //Reverse string using Recursion
    public static void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    public  static void reverse(char[] s,int left, int right){
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reverse(s,left+=1,right -=1);
    }
    //Power of 2
    public static boolean powerOfTwo(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }
    //power of 3
    public static boolean powerOfThree(int n){
       if (n <= 0) return false;
       else if (n == 1) return true;
       return powerOfThree(n/3);
    }
    //power of 4
    public static boolean isPowerOfFour(int n) {
        // Base case: if n is less than or equal to 0, it's not a power of 4
        if (n <= 0) {
            return false;
        }

        // Base case: if n is exactly 1, it's a power of 4 (4^0 = 1)
        if (n == 1) {
            return true;
        }

        // If n is not divisible by 4, it can't be a power of 4
        if (n % 4 != 0) {
            return false;
        }

        // Recursive step: divide n by 4 and check recursively
        return isPowerOfFour(n / 4);
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int [] arr = {1,2,3,5,6};
        //System.out.println(sorted(arr,0));
        //System.out.println(findTarget(arr,8));
        //System.out.println(rotatedSearch(arr,5,0,arr.length-1));
        /*
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Reversed string 1: " + new String(s1));

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Reversed string 2: " + new String(s2));
         */
        /*
        //power of two
        System.out.println(powerOfTwo(1));
        System.out.println(powerOfTwo(16));
        System.out.println(powerOfTwo(128));
         */

        /*power of three
        System.out.println(powerOfThree(1));
        System.out.println(powerOfThree(27));
        System.out.println(powerOfThree(3));
        System.out.println(powerOfThree(9));
        System.out.println(powerOfThree(18));
        */
        //power of 4
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(4));
        System.out.println(isPowerOfFour(32));
    }
}