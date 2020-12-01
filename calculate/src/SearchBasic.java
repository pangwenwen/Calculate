public class SearchBasic {
    /**
     * 基本查找
     */

    /**
     * 折半查找:序列为有序数列
     */
    public static int searchB(int[] array,int value){
        int index = -1;
        if (array == null){
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if (array[mid]==value){
                index =  mid;
                break;
            }else if(array[mid] > value){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(index);
        return index;
    }
}
