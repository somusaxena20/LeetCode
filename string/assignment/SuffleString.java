package assignment;
// https://leetcode.com/problems/shuffle-string/
public class SuffleString {
    public static String restoreString(String s, int[] a) {
        char[] arr=new char[a.length];
        StringBuilder str=new StringBuilder();
        for(int i=0;i<a.length;i++){
            arr[a[i]]=s.charAt(i);
        }
        
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
        return str.toString();
    }

    public static void main(String []args)
    {
        String s = "codeleet";
        int []a = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,a));
    }
}
