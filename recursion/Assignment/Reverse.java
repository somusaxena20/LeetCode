package Assignment;

import java.util.Arrays;

public class Reverse {
    static int i = 0;
    public static void reverseString(char[] s) {
        if(i >= s.length/2)
            return;
        char temp = s[i];
        s[i] = s[s.length-i-1];
        s[s.length-i-1] = temp;
        reverseString(s);
    }
    public static void main(String []args)
    {
        char []s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
