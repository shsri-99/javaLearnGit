import java.util.*;
public class Intermediate {
    //Task 1: HCF of two numbers
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //Task 2: LCM of two numbers
    public static void LCM(int a, int b){
        int hcf = findHCF(a,b);
        int x = a/hcf;
        int y = b/hcf;
        int LCM = hcf * (x*y);
        System.out.println("LCM is: "+ LCM);
        }

    //Task 3: Find the perfect number in java
    public static void perfectNumber(int n){
        int sum = 0;
       for (int i = 1; i<=n/2;i++){
           if (n % i ==0){
               sum = sum + i;
           }
       }
       if (sum == n){
           System.out.println(n + " is a perfect number");
       }
       else {
           System.out.println(n + " is not a perfect number");
       }
    }

    // Task 4: Find count of even days of August
    public static void CountEven(int month){
        int c= 0;
        for (int i = 1;i<=month;i++){
            if (i % 2 == 0){
                c+=1;
            }
        }
        System.out.println("count of even days of August is: "+ c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        //System.out.print("Enter the second number: ");
        //int num2 = scanner.nextInt();

        // Finding and displaying the HCF
        //int hcf = findHCF(num1, num2);
        //System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
        //LCM(num1,num2);
        perfectNumber(num1);
        CountEven(31);
    }
}
