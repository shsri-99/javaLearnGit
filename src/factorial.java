import java.util.Scanner;

public class factorial {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        int f = n;
        for (int i = (n - 1); i >= 1; i--) {
            f = f * i;
        }
        System.out.printf("Factorial of %d is %d ", n, f);
    }


    public static void main(String[] args) {
    //factorial();

    }
}