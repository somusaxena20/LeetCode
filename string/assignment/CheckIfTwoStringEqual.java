package assignment;

public class CheckIfTwoStringEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(String x : word1)
        {
            s1.append(x);
        }
        for(String x : word2)
        {
            s2.append(x);
        }
        return s1.toString().equals(s2.toString());
    }
    public static void main(String []args)
    {
        String []s1 = {"ab", "c"};
        String []s2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(s1,s2));
    }
}
