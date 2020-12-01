package two_poniter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findYwei_438 {

    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }

    public  static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length()<p.length()){
            return result;
        }

        int[] res = new int[26];
        for (int i = 0;i<p.length();i++){
            res[p.charAt(i) - 97]++;
        }


        int l = 0;
        int r = -1;

        while (r+1<s.length()){
            int ff  = s.charAt(r+1) - 97;
            if (res[ff]>0){
                res[ff]--;
                r++;
            }else {
                res[s.charAt(l++)-97]++;
            }

            if (r - l + 1 == p.length()){
                result.add(l);
                res[s.charAt(l++)-97]++;
            }else if (r - l == -1){
                if (res[ff] < 0){
                    r++;
                    l = r+1;
                }
            }

        }

        return result;

    }
}
