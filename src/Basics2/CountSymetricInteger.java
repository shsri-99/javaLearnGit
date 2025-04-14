package Basics2;

public class CountSymetricInteger {
    public int countSymmetricIntegers(int low, int high) {
        int counter=0;
        for(int i = low;i<=high;i++){
            String numberStr = Integer.toString(i);
            int len = numberStr.length();
            if(len % 2 == 0){
                String firstHalf = numberStr.substring(0, len / 2);
                String secondHalf = numberStr.substring(len / 2);
                int sum1 = 0,sum2 = 0;
                for (int j =0; j< firstHalf.length();j++){
                    sum1+=firstHalf.charAt(j) - '0';
                }
                for (int k =0; k< secondHalf.length();k++){
                    sum2+=secondHalf.charAt(k) - '0';
                }
                if (sum1 == sum2) counter+=1;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        CountSymetricInteger sc = new CountSymetricInteger();
        int low = 1000;
        int high = 2000;
        int result = sc.countSymmetricIntegers(low, high);
        System.out.println("Number of symmetric integers between " + low + " and " + high + ": " + result);
    }
}
