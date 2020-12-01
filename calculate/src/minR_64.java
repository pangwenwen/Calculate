public class minR_64 {
    public static int minPathSum(int[][] grid) {
        if (grid == null ){
            return 0;
        }

        int row = grid.length;
        int h = grid[0].length;
        int[][] rout = new int[row][h];

        // 状态转移方程
        //c[i][j] = Math.min(rout[i-i][j],rout[i][j-1])+grid[i][j];

        for(int i = 0;i<row;i++){
            for (int j = 0;j<h;j++){
                if (i == 0 && j == 0){
                    rout[i][j] = grid[i][j];
                }else if (j == 0){
                    rout[i][j] = rout[i-1][j] + grid[i][j];
                }else if (i == 0){
                    rout[i][j] = rout[i][j-1] + grid[i][j];
                } else {
                    rout[i][j] = Math.min(rout[i-1][j],rout[i][j-1])+grid[i][j];
                }

            }
        }

        return rout[row-1][h-1];
    }
}
