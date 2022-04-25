public class Recursion {
    public static void f(int i)
    {
        if(i == 10)
            return;
        System.out.print(i+"\t");
        i++;
        f(i);
    }
    public static void main(String []args)
    {
        f(1);
    }
}
