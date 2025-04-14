package basics;
import java.util.*;
import java.util.Arrays;
public class Recurrsion3 {
//Sum triangle from array
    public static void printTriangle(int [] a){
        if (a.length < 1) return;
        int [] res = new int[a.length - 1];
        for (int i = 0; i < a.length-1;i++){
            int temp = a[i] + a[i+1];
            res[i] = temp;
        }
        printTriangle(res);
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
    int [] a = {1, 2, 3, 4, 5};
    printTriangle(a);

    }
}
