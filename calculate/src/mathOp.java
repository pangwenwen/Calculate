import java.util.Map;

public class mathOp {

    public static double sqrt(int a){
        double low = 0;
        double height = a;
        double result = low;
        while (low <=height){
           double mid = (low+height)/2.0;
           if(Math.abs(a/mid - mid) <1e-3){
               result = mid;
               break;
           }else if (a/mid > mid){
             // 说明result 小
               low = mid ;
           }else {
               height = mid;
           }
        }
        return result;
    }
}
