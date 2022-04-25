package Assignment;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

public class FindKthBitNthBinaryString {

    public static char findKthBit(int n, int k) {
        return findSn(n,"").charAt(k-1);
    }

    public static String findSn(int n, String result)
	{
		if(n==1)
		{
			return "0";
		}
		String result1=findSn(n-1, result);
		result = result1+"1"+reverse(invert(result1));
		return result;
	}
	
	private static String reverse(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	
	private static String invert(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray())
		{
			if(c=='1')
			{
				sb.append("0");
			}
			else
			{
				sb.append("1");
			}
		}
		return sb.toString();
	}

    public static void main(String []args)
    {
        System.out.println(findKthBit(3,1));
    }
}
