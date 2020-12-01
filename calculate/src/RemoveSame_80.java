public class RemoveSame_80 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums == null){
            return -1;
        }

        int j = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
