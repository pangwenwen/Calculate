import java.util.List;
import java.util.Map;

/**
 * 1. 递归+记忆化 -> 地推
 * 2. 状态的定义：opt[n],dp[n],fib[n]
 * 3. 状态转移方程：opt[n] = best_of(opt[n-1],opt[n-2]);
 * 4. 最优子结构
 *
 * * 从底向上进行递推，含有if else
 */
public class DynamicTrain {

    public static int fibE(int n,int[] memory){
        if (n <= 1) {
            return n;
        }
        if (memory[n] == 0){
            memory[n] = fibE(n-1,memory)+fibE(n-2,memory);
        }
        return memory[n];
    }

    public static int[][] Labyrinth(int[][] maze){
        int r = maze.length;
        int l = maze[0].length;
        int opt[][] = new int[r][l];

        for (int i = r-1;i>=0;i--){
            for (int j = l - 1;j>=0;j--){
                if (maze[i][j] == 1){
                    opt[i][j] =  0;
                }else if(i == r-1 && j==l-1){
                    opt[i][j] =  0;
                }else if (i == r-1 || j==l-1){
                    opt[i][j] =  1;
                }else {
                    opt[i][j] = opt[i+1][j]+opt[i][j+1];
                }
            }
        }
        return opt;
    }

    public static int paflower(int n){
        if (n <= 2){
            return n;
        }
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2;i<n;i++){
            memo[i] = memo[i-1]+memo[i-2];
        }
        return memo[n-1];
    }

    public static int trangleMin(List<List<Integer>> trangle){
        int row = trangle.size();
        int lin = trangle.get(row-1).size();
        int[][] min = new int[row][lin];

        for (int m = 0;m<lin;m++){
            min[row-1][m] = trangle.get(row-1).get(m);
        }
        for (int i = row-2;i>=0;i--){
            int r = trangle.get(i).size();
            for (int j=0;j<r;j++){
                min[i][j] = trangle.get(i).get(j)+ Math.min(min[i+1][j],min[i+1][j+1]);
            }
        }
        return min[0][0];
    }

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                int tmp = imax;
                imax = imin;
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);

            max = Math.max(max, imax);
        }
        return max;
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }

        int res = 1;
        int lenght = nums.length;
        int[] dp = new int[lenght];

        // 初始化都为1
        for (int i = 0; i < lenght; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < lenght; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
        return res;
    }

    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length<0 || amount<=0){
            return -1;
        }

        int[] dp = new int[amount+1];
        for (int i = 0;i<amount+1;i++){
            dp[i] = amount+1;
        }

        dp[0] = 0;

        for (int i = 0;i<amount+1;i++){
            for (int j = 0;j<coins.length;j++){
                int dex = i - coins[j];
                if (dex >= 0){
                    dp[i] = Math.min(dp[i],dp[dex]+1);
                }
            }
        }

        return dp[amount]==amount+1?-1:dp[amount];
    }
}