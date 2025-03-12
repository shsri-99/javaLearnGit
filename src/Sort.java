public class Sort {
    public static void sortArr(int [] nums){
        for(int i =0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 1, 3, 2};
        sortArr(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print(arr[1]);
    }
}
