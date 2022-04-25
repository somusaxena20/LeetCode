package assigenments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> h = new HashMap<>();
        for(String s : strs)
        {
            char []a = s.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!h.containsKey(key))
                h.put(key,new ArrayList<>());
            h.get(key).add(s);
        }
        return new ArrayList<>(h.values());
    }
    public static void main(String []args)
    {
        String []str = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(str);
    }
}
