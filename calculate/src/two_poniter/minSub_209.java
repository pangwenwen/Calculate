package two_poniter;

public class minSub_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int subLen = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] >= s){
                return 1;
            }else {
                int sumM = nums[i];
                int subLenT = 1;
                for (int j = i+1;j<nums.length;j++){
                   sumM = sumM+nums[j];
                    subLenT++;
                   if (sumM >= s){
                       if (subLen == 0){
                           subLen = subLenT;
                       }else {
                           subLen = Math.min(subLen,subLenT);
                       }
                       break;
                   }
                }
            }
        }
        return subLen;
    }

    public int minSubArrayLenO(int s, int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int subL = Integer.MAX_VALUE;

        while (end < nums.length){
            sum += nums[end];
            while (sum >= s){
                subL = Math.min(subL,end-start+1);
                sum = sum-nums[start++];
            }
            end++;
        }
        return subL == Integer.MAX_VALUE?0:subL;
    }

    public int minSubArrayLen1(int s, int[] nums) {
        if (nums == null || nums.length ==0){
            return 0;
        }

        int l = 0;
        int r = -1;
        int res = nums.length+1;
        int sum = 0;
        while (l<nums.length){
            if ( r+1<nums.length && sum < s){
                sum += nums[++r];
            }else {
                sum -= nums[l++];
            }
            if(sum >= s){
                res = Math.min(res,r-l+1);
            }

        }

        if (res == nums.length+1){
            return 0;
        }

        return res;
    }
}
