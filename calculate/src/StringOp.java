import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringOp {

    public static boolean isvalid(String str){
        Stack stack = new Stack<Character>();
        char[] chars = str.toCharArray();
        Map map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        int length = chars.length;
        System.out.println(map.keySet());
        for(char c : chars){
            if (!map.containsKey(c)){
                stack.push(c);
                if (stack.size() > length){
                    System.out.println("1. 不合法");
                    return false;
                }
            }else if(stack.isEmpty() || (c != (char)map.get((Character)stack.pop()))){
                System.out.println("2. 不合法");
                return false;
            }
        }
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }

    public static boolean validAnagram(String a,String b){
        if (a==null || b==null || a.length()!=b.length()){
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0;i<a.length();i++){
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i) - 'a']--;
        }
        for (int i = 0;i<26;i++){
            if (arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
