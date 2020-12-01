package two_poniter;

public class Three_sort_75 {
    public static void sortColors(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int i = -1;
        int j = nums.length;

        for(int m = 0;m<j;){
            if (nums[m] == 1){
                m++;
            }else if (nums[m] == 0){
                int temp = nums[++i];
                nums[i] = 0;
                nums[m++] = temp;
            }else if (nums[m] == 2){
                int temp = nums[--j];
                nums[j] = 2;
                nums[m] = temp;
            }
        }

        for (int k = 0;k<nums.length;k++){
            System.out.println(nums[k]+" ");
        }
    }
}
