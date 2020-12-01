import java.util.*;

public class ArrayOp {

    public static int[] twoAdd(int[] a,int exp){
        if (a==null || a.length ==0) {
            return null;
        }

        int[] result = null;
        HashMap map = new HashMap();
        for (int i=0;i<a.length;i++){
            if (map.containsKey(9-a[i])){
                result = new int[]{i, (int)map.get(9 - a[i])};
            }
            map.put(a[i],i);
        }
        return result;
    }

    public static List<List<Integer>> threeAdd(int[] a,int exp){
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(a);
       if (a == null || a.length<3){
           return result;
       }
       int len = a.length;
       for (int i = 0;i<len-2;i++){
           int j = i+1;
           int k = len -1;
           while (j<k){
               if (a[i]+a[j]+a[k] == 0){
                   result.add(Arrays.asList(a[i],a[j],a[k]));
                   j++;
                   while (j<k && a[j-1]==a[j]) j++;
               }else if (a[i]+a[i]+a[k] < 0){
                   j++;
               }else {
                   k--;
               }
           }
       }

       return result;
    }

}
