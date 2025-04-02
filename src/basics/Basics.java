package basics;

import java.util.*;

public class Basics {

    //Task one: Odd and Even number                                         ---1
    public static void OddEven(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    //Task two:  Take name as input and print a greeting message for that particular name.  ---2

    public static void GreetinMessage(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Welcome to Java world " + name);
    }

    //Task 3:program to input principal, time, and rate (P, T, R) from the user and find Simple Interest. ---3
    public  static void SimpleInterest(int p,int t,int r) {
        int SI= (p * t * r)/100;
        System.out.println("Simple interest is:  "+SI);
    }

    //Task 4: Take in two numbers and an operator (+, -, *, /) and calculate the value.         -----4
     public static void calculator(int a,int b){
        Scanner scanner=new Scanner(System.in);
         System.out.println("Enter sign: ");
        String sign = scanner.next();
        if (sign.equals("+")){
            System.out.println("Addition result is: "+ (a+b));
        }
         else if (sign.equals("-") ){
             System.out.println("Subtraction result is: "+ (a-b));
         }
         else if (sign.equals("*")){
             System.out.println("Multiplication result is: "+ (a*b));
         }
         else if (sign.equals("/")){
             System.out.println("Division result is: "+ (a/b));
         }
         else {
            System.out.println("Invalid sign");
        }
    }
// Task 5: Take 2 numbers as input and print the largest number.            ---5
    public static void LargestNum(int a, int b){
        if (a>b){
            System.out.printf("%d is the largest number",a);
        }
        else{
            System.out.printf("%d is the largest number",b);
        }
    }
//Task 6: Input currency in rupees and output in USD.                           ---6
    public static void PoundsInr(float gbp){
        System.out.println("Amount in pounds: "+gbp);
        float inr =  gbp * 109.2f;
        System.out.println("Amount in INR: "+ inr);
    }
//Task 7: To calculate Fibonacci Series up to n numbers.
    public static void Fibonacci(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter number: "+num);
        int a = 0, b=1,count =2;
        while (count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count ++;

        }
        System.out.println("Fibonacci series is: "+b);
    }
    //Task 8: To find out whether the given String is Palindrome or no.         ---8
    public static void Pallindrome(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter number: "+num);
        int og= num;
        int ans = 0;
        while (num!= 0){
            int dig = num % 10;
            ans = ans * 10 + dig;
            num = num / 10;
        }
        if (ans == og){
            System.out.println("is a pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }

    }
//To find Armstrong Number between two given number.
    public static void Armstrong(int num1){
        int sum = 0;
        int og=num1;
        int power = String.valueOf(num1).length();
        while (num1!=0){
            int a= num1 % 10;
            sum= (int) (sum + Math.pow(a,power));
            num1 = num1/10;
        }
        if (sum==og){
        System.out.println(og+ " is a Armstrong");
        }
        else{
            System.out.println("not an armstrong");
        }
    }


    //Main method of the file, call all the other methods here                  --- main
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //OddEven();
        //GreetinMessage();
        //SimpleInterest(8000,3,9);
        //calculator(7, 4);
        //LargestNum(num1,num2);
        //PoundsInr(500);
        //Fibonacci();
        //Pallindrome();
        //Armstrong(num1);
    }
}

