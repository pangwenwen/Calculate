import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Threesub {
    public static int threeSumClosest(int[] nums, int target) {
        int result = (int)Math.pow(10,3);
        int len = nums.length;
        for (int i = 0;i<len-2;i++){
            int temp1 = nums[i];
            for (int j = i+1;j<len-1;j++){
                int temp2 = nums[j];
                for (int k = j+1;k<len;k++){
                    int temp3 = nums[k];
                    int sumI = temp1+temp2+temp3;
                    if (Math.abs(sumI - target) < Math.abs(result - target) ){
                        result = sumI;
                    }
                }
            }
        }

        return result;
    }

    public static int threeSumClosestOpt(int[] nums,int target){
        int len  = nums.length;
        int result = (int)Math.pow(10,3);

        Arrays.sort(nums);

        for (int i=0;i<len-2;i++){
            if (i-1>0 && nums[i] == nums[i-1]){
                break;
            }

            int temp2 = i+1;
            int temp3 = len-1;
            int subR = nums[i] + nums[temp2] + nums[temp3];

            while (temp3 > temp2){
                if (subR == target){
                    return target;
                }else if (subR > target){
                    if (Math.abs(subR-target)<Math.abs(result-target)){
                        result = subR;
                    }
                    subR = nums[i] + nums[temp2] + nums[--temp3] ;
                    continue;
                }else {
                    if (Math.abs(subR-target)<Math.abs(result-target)){
                        result = subR;
                    }
                    subR = nums[i] + nums[++temp2] + nums[temp3] ;
                    continue;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // 使用hash
    public int[] twoSumGood(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        if (l1 == null && l2 == null){
            return null;
        }

        Node temp1 = l1;
        Node temp2 = l2;
        Node head = new Node(0);
        Node r = head;
        int p = 0;
        while (temp1!= null || temp2!=null){
            int sub = p;
            if (temp1 != null){
                sub += temp1.value;
                temp1 = temp1.next;
            }
            if (temp2!= null){
                sub+=temp2.value;
                temp2 = temp2.next;
            }

            p = sub/10;
            r.next = new Node(sub%10);
            r = r.next;
        }
        if (p >0){
            r.next = new Node(p);
        }
        return head.next;
    }
}
