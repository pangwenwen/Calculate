public class BitOp {

    /**
     * 求二进制中1的个数
     *
     * @param n
     * @return
     */
    public static int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

    /**
     * 求一个数是否是2的幂次方
     */
    public static boolean isPowerOfTwo(int num){
        if (num == 0){
            return false;
        }
        return (num&(num-1))==0;
    }



}
