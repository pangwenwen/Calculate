package two_poniter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StringNoL_3 {



    public static int lengthOfLongestSubstring(String s) {
        int len = -1;
        if (s == null ){
            return len;
        }

        if (s.length() == 1){
            return 1;
        }

        Set<Character> set = new HashSet<>();

        int max = 0;
        for (int i = 0;i<s.length();i++){
            if (set.size()>0){
                set.remove(s.charAt(i-1));
            }
            int temp = 0;
            int j = i;
            while (!set.contains(s.charAt(j)) && j<s.length()){
                set.add(s.charAt(j++));
                temp++;
            }
            max = Math.max(max,temp);
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int len = -1;
        if (s == null ){
            return len;
        }

        if (s.length() == 1){
            return 1;
        }

        int[] sec = new int[256];
        int i = 0;
        int j = -1;
        int max = 0;
        while (i<s.length()){
            if (j+1<s.length()&&sec[s.charAt(j+1)] == 0){
                sec[s.charAt(++j)] = 1;
            }else {
                sec[s.charAt(i++)] -- ;
            }
            max = Math.max(max,j-i+1);
        }
        return max;

    }
}
