public class mergeTwoNum_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ((nums1 == null && nums2 == null) || nums2 == null){
            return;
        }

        int i = 0;
        int j = 0;
        while (j <n-1){
            if (nums1[i] <=nums2[j]){
                i++;
            }

            if (nums1[i] > nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
            }

        }
    }
}
