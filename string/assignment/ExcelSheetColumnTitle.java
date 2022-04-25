package assignment;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String s="";	
		while(columnNumber!=0) {
				int i =columnNumber%26;
				if(i==0)
					i=26;
				s+=String.valueOf((char)(64+i));
				columnNumber-=i;
				columnNumber/=26;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(s);
		return sb.reverse().toString();
    }
    public static void main(String []args)
    {
        // String moves = "Let's take LeetCode contest";
        System.out.println(convertToTitle(28));
    }
}
