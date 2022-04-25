package assignment;

public class GoalParser {
    public static String interpret(String str) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<str.length(); i++)
        {
            if(i+1 < str.length() && str.charAt(i) == '(' && str.charAt(i+1) == ')')
            {
                s.append('o');
                i++;
            }
            else if(i+3 < str.length() && str.charAt(i) == '(' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'l' && str.charAt(i+3) == ')')
            {
                s.append('a');
                s.append('l');
                i=i+3;
            }
            else
            {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
    public static void main(String []args)
    {
        String s = "G()(al)";
        System.out.println(interpret(s));
    }
}
