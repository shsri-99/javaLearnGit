package basics;

import java.util.Arrays;

public class TwoPointer {
    public static boolean PythagoreanTriplets(int [] numbers){
       for (int i= 0;i <numbers.length;i++){
           numbers[i] = numbers[i] * numbers[i];
       }
       Arrays.sort(numbers);
        for (int i=numbers.length-1; i>0;i--){
            int min = 0;
            int max = i-1;
            while(max > min){
                if(numbers[min] + numbers[max]==numbers[i]){
                    return true;
                }
                else if(numbers[min]+numbers[max] > numbers[i]){
                    max --;
                } else if (numbers[min]+numbers[max]< numbers[i]) {
                    min++;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] numbers = {3,1,4,6,5};
        boolean result = PythagoreanTriplets(numbers);
        System.out.println(result);
        }
    }

