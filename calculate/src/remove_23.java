class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (k == i){
                if (nums[k] != val){
                    k++;
                }
                continue;
            }
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}


public class remove_23 {
    public static void main(String[] args) {
        int[] array = {3,2,2,3};
//        new Solution().removeElement(array,2);
        System.out.println(new Solution().removeElement(array,3));
    }
}
