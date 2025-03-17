import java.util.*;
import java.util.Arrays;
public class LargetPerimeterArray {
    /*Get the largest value by sorting the array and reversing the array and call
    perimeter function.
     */
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--){
            int perimeter = perimeterTriange(nums[i],nums[i-1],nums[i-2]);  //Calling the function
            if (perimeter > 0) {
                return perimeter; // If a valid triangle is found, return the perimeter
            }
        }
        return 0;
    }
    /* TO calculate perimeter of the triangle including conditions and if no condition
    satisfied then return 0.
     */
    public static int perimeterTriange(int a,int b,int c){
        if (a + b > c && b + c > a && a + c > b){
            return a + b + c;
        }
        else { return 0;
        }
    }
    public static void main(String[] args){
        int res = largestPerimeter(new int[]{2,1,2});
        System.out.println(res);
    }
}
