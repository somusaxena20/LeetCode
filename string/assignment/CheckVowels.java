package assignment;

// 1704. Determine if String Halves Are Alike
// https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class CheckVowels {
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int i = 0; i<s.length()/2; i++)
        {
                s1.append(s.charAt(i));
                s2.append(s.charAt(s.length()/2+i));
        }

        int s1v = 0,s2v=0;

        for(int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u' )
            {
                s1v++;
            }
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u' )
            {
                s2v++;
            }
        }

        return s1v == s2v;

    }
    public static void main(String []args)
    {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}
