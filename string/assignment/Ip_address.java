package assignment;

public class Ip_address {
    public static String defangIPaddr(String a) {
        String str = "";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='.') 
                str+="[.]";
            else
                str+=String.valueOf(a.charAt(i));
      }
      return str;
    }
    public static void main(String []args)
    {
        String str = "1.1.1.1";
        defangIPaddr(str);
    }
}
