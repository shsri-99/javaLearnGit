public class MaxProductOfThree {
    public static int threeMaxProduct(int[] nums) {
        // Initialize the variables to extremes
        int maxVal1 = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;
        int maxVal3 = Integer.MIN_VALUE;
        int minVal1 = Integer.MAX_VALUE;
        int minVal2 = Integer.MAX_VALUE;

        // Traverse the array and maintain the top 3 largest and 2 smallest values
        for (int num : nums) {
            // Update the largest three values
            if (num > maxVal1) {
                maxVal3 = maxVal2;
                maxVal2 = maxVal1;
                maxVal1 = num;
            } else if (num > maxVal2) {
                maxVal3 = maxVal2;
                maxVal2 = num;
            } else if (num > maxVal3) {
                maxVal3 = num;
            }

            // Update the smallest two values
            if (num < minVal1) {
                minVal2 = minVal1;
                minVal1 = num;
            } else if (num < minVal2) {
                minVal2 = num;
            }
        }

        // Calculate the two possible products
        int product1 = maxVal1 * maxVal2 * maxVal3; // Top 3 largest values
        int product2 = minVal1 * minVal2 * maxVal1; // Two smallest and largest value

        // Return the maximum product
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int product = MaxProductOfThree.threeMaxProduct(new int[] {-1000, -98, -65, 1, 2, 3, 4});
        System.out.println(product); // Output the result
    }
}
