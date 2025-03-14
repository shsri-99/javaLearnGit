import java.util.Locale;

public class PallindromeStrings {
    public static boolean pallindrome(String str){
    if(str == null || str.length() ==0){
        return false;
    }
    if(str.length() == 1){
        return false;
    }
    str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
    String str = "abd";
        System.out.println(pallindrome(str));
    }
}
