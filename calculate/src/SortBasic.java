public class SortBasic {
    /**
     * 插入排序
     */

    // 1. 直接插入排序
    public static void insertD(int array[]){
        if (array == null){
            return ;
        }

        int len = array.length;
        for (int i = 1;i<len;i++){
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }
            array[++j] = temp;
        }

        //打印
        for (int m = 0;m<len;m++){
            System.out.print(array[m]);
            System.out.print(" ");
        }
    }

    //2. 折半插入排序:时间复杂度O(n^2),空间复杂度O(1)
    //3. 希尔排序: 将待排序列按照某种规则分成几个子序列，分别对这几个子序列进行排序，
    //       注意点：增量序列的最后一个值一定取1；增量序列中的值尽量没有除1之外的公因子

    /**
     * 交换类排序
     */
    //1. 冒泡排序
    public static void sortBub(int[] array){
        if (array == null){
            return;
        }

        int len = array.length;
        boolean flag = true;
        int i = len-1;
        while (i > 0 && flag){
            flag = false;
            for (int j = 0;j<i;j++){
                if (array[j] > array[j+1]){
                    flag = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            i--;
        }
        //打印
        for (int m = 0;m<len;m++){
            System.out.print(array[m]);
            System.out.print(" ");
        }

    }

    // 2. 快排：通过多次划分操作完成排序
    public static void quick_sort(int[] array,int low,int heigh){
        if (array == null || low>=heigh){
            return;
        }
        int temp = array[low];
        int i = low;
        int j = heigh;

        while (i != j){
            while (i<j && array[j] >= temp){
                j--;
            }
            if (i<j){
                array[i] = array[j];
                i++;
            }

            while (i<j && array[i]<=temp){
                i++;
            }
            if (i<j){
                array[j] = array[i];
                j--;
            }
        }
        array[i] = temp;

        quick_sort(array,low,i-1);
        quick_sort(array,i+1,heigh);
    }

    /**
     * 选择排序
     */
    // 1. 堆排序。
    // 2. 二路归并排序：两两归并形成若干个有序二元组，继续两两归并排序

    /**
     * 基数排序：以个十百对应的数字分别对应的数字放入到对应的桶中
     */
}
