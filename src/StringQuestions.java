import java.util.Arrays;
public class StringQuestions {

        public String reverseWords(String s) {
            String[] words = s.split(" ");

            // Reverse the words array
            for(int i = 0;i<words.length;i++){
                words[i]= reverseFunction(words[i]);
            }
            // Join the reversed words and return as a string
            return String.join(" ", words);
        }
        //This function is to only reverse the string within words
        public String reverseFunction(String word){
            char[] charArray = word.toCharArray();  // Convert string to char array
            int start = 0;
            int end = charArray.length - 1;

            // Reverse the char array
            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }

            // Convert the char array back to a string
            return new String(charArray);
        }
        //Merge String alternatively
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<n1 && j<n2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while(i<n1) sb.append(word1.charAt(i++));
        while(j<n2) sb.append(word2.charAt(j++));
        return sb.toString();
    }
        //Main Function
        public static void main(String[] args) {
            // Create an instance of Solution
            StringQuestions solution = new StringQuestions();
/* For reverse words
            // Test case 1
            String input = "Let's take LeetCode contest";
            String result = solution.reverseWords(input);
            System.out.println("Result: " + result);

            // Test case 2 (Another example)
            String input2 = "   Hello   world   ";
            String result2 = solution.reverseWords(input2);
            System.out.println("Result: " + result2);
 */
            // Test case 1
            String word1 = "abc";
            String word2 = "pqr";
            String result1 = solution.mergeAlternately(word1, word2);
            System.out.println("Test Case 1: " + result1);  // Expected output: "apbqcr"

            // Test case 2
            word1 = "ab";
            word2 = "pqrs";
            String result2 = solution.mergeAlternately(word1, word2);
            System.out.println("Test Case 2: " + result2);  // Expected output: "apbqrs"
        }
    }


