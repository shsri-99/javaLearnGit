package basics;

/*Pattern1: Iterates through each row which is outer loop that should be equal to
number of lines and second loop iterates for column which is less than each row in
 each line here.Pattern is string *
        */
public class StringPatterns {
    public static void pattern1(int n){
        for (int row = 1; row <= n;row++){
            for (int col = 1; col <= row;col++){
                System.out.print("* ");
            }
            //After one row we want next line
            System.out.println();
        }
    }
    /*Pattern2: Iterates through each row which is outer loop that should be equal to
number of lines and second loop iterates for column which decreases for each row in
 each line here.Pattern is string *
        */
    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            //After one row we want next line
            System.out.println();
        }
    }
    /*Pattern3: Iterates through each row which is outer loop that should be equal to
number of lines and second loop iterates for column which is less than each row in
 each line here. However here the pattern should be numbers.
        */
    public static void pattern3(int n){
        for (int row = 1; row <= n;row++){
            for (int col = 1; col <= row;col++){
                System.out.print(col + " ");
            }
            //After one row we want next line
            System.out.println();
        }
    }
    /*Pattern4: Iterates through each row which is outer loop that should be equal to
    number of lines and second loop iterates for column which increases initially
    and then decreases. However here the pattern should be *
            */
    public static void pattern4(int n){
        for (int row = 1; row <= n;row++){
            int c = 0;
            for (int col = 1; col <= c;col++){
                System.out.print(col + " ");
            } 
            //After one row we want next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //pattern1(8);                     //calling pattern1 function
        //pattern2(5);                    //calling pattern2 function
        pattern3(4);                    //calling pattern3 function
    }
}
