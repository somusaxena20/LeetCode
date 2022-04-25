package assignment;

public class KThMissingElement {

    public static int kThMissing(int []a , int k)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
	        if (k <= a[i] - 1 - i) {
		        return i + k;
	        }
        }       
        return n + k;
    }

    public static void main(String []args)
    {
        int []a = {2,3,4,7,11};
        System.out.println(kThMissing(a,5));
    }
}
