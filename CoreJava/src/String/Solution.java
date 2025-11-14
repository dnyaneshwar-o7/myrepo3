package String;

public class Solution {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // split by one or more spaces
        String reversed = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
            if (i != 0) reversed += " "; // add space between words except after last one
        }
        return reversed;
    }

    public static void main(String[] args) {
        String s = "  hello   world  ";
        System.out.println(reverseWords(s));  // Output: "world hello"
    }
}
