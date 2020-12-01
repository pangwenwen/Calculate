public class LargeWarter_11 {
    // 普通遍历
    public  static int maxArea(int[] height) {
        int length = height.length;
        int max = -1;
        for (int i = 0;i<length-1;i++){
            for (int j = i+1;j<length;j++){
               int h = Math.min(height[i],height[j]);
               int w = j-i;
               max = Math.max(max,(h*w));
            }
        }
        return max;
    }

    //
    public static int maxArea2(int[] height) {
        int h = height.length-1;
        int l = 0;
        int max = -1;
        while (l<h){
            int a = height[l];
            int b = height[h];
            max = Math.max(max,Math.min(a,b)*(h-l));
            if (a<b){
                l++;
            }else {
                h--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
