package two_poniter;

import java.util.ArrayList;
import java.util.Arrays;

public class findNMax215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || k<0 || nums.length<k){
            return Integer.MIN_VALUE;
        }

        return quick(nums,0,nums.length-1,nums.length - k);
    }

    public int quick(int[] array,int ll,int rr,int expect){
        if (ll >= rr){
            return Integer.MIN_VALUE;
        }

        int temp = array[ll];
        int l = ll;
        int r = rr;

        while (l != r){
            while (array[r] >= temp && r>l){
                r--;
            }
            if (l < r){
                array[l] = array[r];
                l++;
            }
            while (array[l] <= temp && r>l){
                l++;
            }
            if (l<r){
                array[r] = array[l];
                r--;
            }
        }
        array[l] = temp;
        if (l == expect){
            return array[l];
        }
        quick(array,ll,--l,expect);
        quick(array,++l,rr,expect);
        return array[expect];
    }

}
