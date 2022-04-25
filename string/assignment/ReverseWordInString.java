package assignment;

// 557. Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordInString {
    public static String reverseWords(String s) {
        String [] w = s.split(" ");
        StringBuilder str = new StringBuilder();

        for(String x : w)
        {
            str.append(new StringBuilder(" "+x).reverse().toString());
        }
        return str.toString().trim();
        
    }
    public static void main(String []args)
    {
        String moves = "Let's take LeetCode contest";
        System.out.println(reverseWords(moves));
    }
}
