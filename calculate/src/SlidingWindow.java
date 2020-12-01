import java.util.ArrayDeque;

public class SlidingWindow {
    // 双端队列
    static ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    static int[] numsO;

    private static void clean_num(int i,int k){
        if (!arrayDeque.isEmpty() && arrayDeque.getFirst()==i-k){
            arrayDeque.removeFirst();
        }

        while (!arrayDeque.isEmpty() && numsO[i]>arrayDeque.getLast()){
            arrayDeque.removeLast();
        }
    }

    public static int[] getMax(int[] nums,int k){
        int len = nums.length;
        if (len * k <=0){
            return new int[0];
        }
        if (k == 1 || len==1){
            return nums;
        }

        numsO = nums;
        int max_index = 0;
        for (int i=0;i<k;i++){
            clean_num(i,k);
            arrayDeque.addLast(i);
            if (numsO[i]>numsO[max_index]){
                max_index = i;
            }
        }

        int[] out = new int[len-k-1];
        out[0] = numsO[max_index];

        for (int i = k;i<len;i++){
            clean_num(i,k);
            arrayDeque.addLast(numsO[i]);
            out[i-k+1] = arrayDeque.getFirst();
        }
        return out;

    }

}
