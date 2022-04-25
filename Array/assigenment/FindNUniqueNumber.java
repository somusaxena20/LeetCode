public class FindNUniqueNumber {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
		int counter = 0;
		for(int i = 1; i <= n / 2; ++i) {
			result[counter++] = i;
			result[counter++] = -i;   
		}
		return result;
    }
    public static void main(String []args)
    {
        int []a = sumZero(10);
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
