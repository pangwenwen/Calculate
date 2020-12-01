public class nums_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // bt[m][n] = bt[m][n-1] + bt[m-1][n];
        if (obstacleGrid == null || obstacleGrid.length == 0){
            return -1;
        }
        int r = obstacleGrid.length;
        int l = obstacleGrid[0].length;
        int[][] bt = new int[r+1][l+1];


        for (int i = 0;i<r;i++){
            for (int j = 0;j<l;j++){
                if (obstacleGrid[i][j] == 1){
                    bt[i+1][j+1] = 0;
                    continue;
                }

                if (i == 0 && j==0){
                    bt[1][1] = 1;
                    continue;
                }

                bt[i+1][j+1] = bt[i+1][j] + bt[i][j+1];
            }
        }

        return bt[r][l];
    }
}
