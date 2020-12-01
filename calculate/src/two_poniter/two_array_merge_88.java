package two_poniter;

public class two_array_merge_88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
//            // two get pointers for nums1 and nums2
//            int p1 = m - 1;
//            int p2 = n - 1;
//            // set pointer for nums1
//            int p = m + n - 1;
//
//            // while there are still elements to compare
//            while ((p1 >= 0) && (p2 >= 0))
//                // compare two elements from nums1 and nums2
//                // and add the largest one in nums1
//                nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];
//
//            // add missing elements from nums2
//            System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
            /**
             * 从尾部开始遍历
             */
            int p = m-1;
            int q = n-1;
            int x = m+n-1;

            while (p>=0 && q>=0){
                if (nums1[p]>nums2[q]){
                    nums1[x--] = nums1[p--];
                }else {
                    nums1[x--] = nums2[q--];
                }
            }

            System.arraycopy(nums2,0,nums1,0,q+1);

        }
    }

    public static void main(String[] args) {
        int[] array1 = {0,0,0,0,0};
        int[] array2 = {1,2,3};
        System.arraycopy(array2,0,array1,0,3);
        for (int i= 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
