// 1832. Check if the Sentence Is Pangram
// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Pangram {
    public static boolean checkIfPangram(String s) {
        boolean [] x = new boolean[26];
        int index = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
            {
                index = s.charAt(i) -'A';
            }
            else if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
            {
                index = s.charAt(i) -'a'; 
            }
            x[index] = true;
        }
 
        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (x[i] == false)
                return (false);
 
        // If all characters were present
        return (true);
        }
    public static void main(String []args)
    {
        String str = "The quick brown fox jumps over the lazy dog";
 
        if (checkIfPangram(str) == true)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }
}
