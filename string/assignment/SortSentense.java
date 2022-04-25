package assignment;

import java.util.HashMap;

public class SortSentense {
    public static String sortSentence(String s) {
        HashMap<Integer,StringBuilder> h = new HashMap<>();

        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) < 58 && s.charAt(i) > 48)
            {
                int x = Integer.valueOf(s.charAt(i)+"");
                h.put(x,str);
                str.setLength(0);
                i=i+2;
            }
            else
            {
                str.append(s.charAt(i));
            }
        }

        str.setLength(0);

        for(int i = 0; i<h.size();i++)
        {
            str.append(h.get(i+1).toString());
        }

        return str.toString();

    }
    public static void main(String []args)
    {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
