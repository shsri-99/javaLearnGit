package Basics2;
import java.util.*;
public class LeetCode1{
    //Array form to integer sum
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        List<Integer> result = new ArrayList<>();
        while (i >= 0 || k > 0){
            int sum = 0;
            //First taking the last digit from the num to add it to sum
            if(i >= 0){
                sum +=num[i];
                i--;
            }
            //Now will take last digit of K to add it to sum
            if(k > 0){
                sum += k%10;
                k=k/10;
            }
            result.add(0,sum % 10);
            k += sum/10;
        }
        return result;
    }
//Remove duplicates from sorted array

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;  // If the array is empty, return 0
        }

        int i = 0;  // Pointer to place the next unique element

        // Start checking from the second element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {  // If a new unique element is found
                i++;  // Move i to the next position
                nums[i] = nums[j];  // Update nums[i] to be the unique element
            }
        }

        // Return the number of unique elements
        return i + 1;  // Since i is the index, the count is i + 1
    }
//FInd lucky numbers in the 2d array matrix
public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> val = new ArrayList<>();

    // Find the minimum in each row
    int[] rowMins = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        int minVal = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[i].length; j++) {
            minVal = Math.min(minVal, matrix[i][j]);
        }
        rowMins[i] = minVal;
    }

    // Find the maximum in each column
    int[] colMaxs = new int[matrix[0].length];
    for (int j = 0; j < matrix[0].length; j++) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            maxVal = Math.max(maxVal, matrix[i][j]);
        }
        colMaxs[j] = maxVal;
    }

    // Compare rowMins and colMaxs to find lucky numbers
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxs[j]) {
                val.add(matrix[i][j]);
            }
        }
    }

    return val;
}


    public static void main(String[] args) {
        /*LeetCode1 solution = new LeetCode1();
        int[] num = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
        int k = 516;

        // Call the method
        List<Integer> result = solution.addToArrayForm(num, k);

        // Print the result
        System.out.println(result);
         */
        /*
        LeetCode1 solution2 =new LeetCode1();
        int[] nums1 = {1, 1, 2};
        int result1 = solution2.removeDuplicates(nums1);

        // Print the result for the first test case
        System.out.println("Number of unique elements: " + result1);
        System.out.print("Updated array: ");
        for (int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        // Test case 2: A sorted array with all unique values
        int[] nums2 = {1, 2, 3, 4, 5};
        int result2 = solution2.removeDuplicates(nums2);

        // Print the result for the second test case
        System.out.println("Number of unique elements: " + result2);
        System.out.print("Updated array: ");
        for (int i = 0; i < result2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
         */
        LeetCode1 solution3 = new LeetCode1();

        // Test case 1: A 3x3 matrix
        int[][] matrix1 = {
                {3, 8, 1},
                {9, 2, 6},
                {5, 7, 3}
        };

        // Call the method to find lucky numbers
        List<Integer> result1 = solution3.luckyNumbers(matrix1);

        // Print the result for the first test case
        System.out.println("Lucky numbers in matrix 1: " + result1);

        // Test case 2: Another matrix
        int[][] matrix2 = {
                {1, 10, 100},
                {2, 50, 60},
                {7, 30, 15}
        };

        // Call the method to find lucky numbers
        List<Integer> result2 = solution3.luckyNumbers(matrix2);

        // Print the result for the second test case
        System.out.println("Lucky numbers in matrix 2: " + result2);

        // Test case 3: A matrix with no lucky numbers
        int[][] matrix3 = {
                {10, 15},
                {20, 25}
        };

        // Call the method to find lucky numbers
        List<Integer> result3 = solution3.luckyNumbers(matrix3);

        // Print the result for the third test case
        System.out.println("Lucky numbers in matrix 3: " + result3);
    }
}
