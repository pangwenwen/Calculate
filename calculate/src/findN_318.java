public class findN_318 {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || k < 1 || k>(matrix.length)*(matrix[0].length)){
            return -1;
        }

        if (k == 1){
            return matrix[0][0];
        }

        int len = matrix.length;

        int i = 0; //从左向右第几个元素
        int j = 0; //中上向下第几个元素

        int m = 1; // 行
        int n = 0; // 列

        int index = 1;
        int sum = (len-1) *(len-1);

        int nMin = 0;

        while (i*j < sum && m*n < sum){
            int rT = matrix[i][j];
            int lT = matrix[m][n];

            if (rT >= lT){
                if (rT != lT){
                    index++;
                }
                nMin = rT;

                if (j >= len-1){
                    i++;
                    j = 0;
                }else {
                    j++;
                }
            }else if (rT < lT){
                index++;
                nMin = lT;

                if (m >= n-1){
                    n++;
                    m = 0;
                }else {
                    m++;
                }
            }

            if (index == k){
                break;
            }
        }
        return nMin;
    }
}
