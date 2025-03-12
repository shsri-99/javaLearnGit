import java.sql.SQLOutput;
import java.util.Scanner;
public class Methods {
    public static int Min(int a, int b, int c){
        int min;
        if ((a < b) && (a < c)){
             min = a;
        }
        else if ((b < a) && (b < c)){
            min = b;
        }
        else {min = c;}

        return min;
    }
    public static int Max(int a,int b,int c){
        int max;
        if ((a > b) && (a > c)){
            max = a;
        }
        else if ((b > a) && (b > c)){
            max = b;
        }
        else {max = c;}

        return max;
    }
    public static void VoteAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible");
        }
    }
    public static void main(String[] args) {
        //int resMin = Min(4,5,2);
        //int resMax=Max(4,5,2);
        //System.out.println("Min Number: "+resMin);
        //System.out.println("Max Number: "+resMax);
        VoteAge();
    }
}
