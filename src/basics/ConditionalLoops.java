package basics;

import java.util.*;
public  class ConditionalLoops {

    //Task 1: Subtract the Product and Sum of Digits of an Integer
    public static int subtractProductAndSum(int n){
    int mul = 1;
    int sum = 0;
    while (n!= 0){
        mul=mul * (n % 10);
        sum= sum + n % 10;
        n=n/10;
    }
        int sub = mul - sum;
    return sub;
    }
    //Task 2: Input a number and print all the factors of that number
    public static void factor(int n){
        for (int i = 1; i <=n/2; i++){
            if (n % i  == 0){
                System.out.print(i + " ");
            }
        }
    }

    //Task 3: Take integer inputs till the user enters 0 and print the sum of all numbers
    public static void SumNumbers(){
        int sum=0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int num = scanner.nextInt();
            if (num ==0){
                break;
            }
            sum = sum + num;
        }
        System.out.println(sum);
    }
    //Task 4: Take integer inputs till the user enters 0 and print the largest number from all.
    public static void largestNum(){
        int a =0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int n = scanner.nextInt();
            if (n==0){
                break;
            }
            if(n>a){
                a=n;
            }
            }
        System.out.println(a+" is the largest number");
        }

    //Task 5: Calculate Average Of N Numbers
    public static void Average(){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            int randomNums = (int)(Math.random() * i);
            System.out.println("The random numbers are: " + randomNums );
            sum=sum + randomNums;
        }
        float avg = (float)(sum/n);
        System.out.println("Average is: "+ avg);

    }

    //Task 6: Calculate Distance Between Two Points
    public static double Distance(double x1,double x2, double y1,double y2){
        System.out.printf("Enter the points: %f,%f,%f,%f%n",x1,x2,y1,y2);
        double d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return d;
    }

    //Task 7: Reverse the string
    public static void ReverseString(){
        String city = "London";
        String rev="";
        for (int i=city.length()-1;i>=0;i--){
            rev=rev + city.charAt(i);
        }
        System.out.println(rev);
    }


        //Main method that can call all the functions                                   ---main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("Enter Two Number: ");
            //for (int i = 1;i<=2;i++) {
            //    int n = scanner.nextInt();
            //    factor(n);}                                                                            // ---Task 2
            //int result = basics.ConditionalLoops.subtractProductAndSum(n);                                   // ---Task 1
            //System.out.println("Result is: "+result);
            //SumNumbers();                                                                              // ---Task 3
            //largestNum();                                                                              // ---Task 4
            //Average();                                                                                 // ---Task 5
            //double distance=Distance(41.5,63.7,45.78,98.76);                                           // ---Task 6
            //System.out.println("Distance calculated: "+ distance);                                     //--- Task 7
            //ReverseString();                                                                           //--- Task 8

            scanner.close();
        }

}
