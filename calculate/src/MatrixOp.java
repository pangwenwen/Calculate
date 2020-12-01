import java.util.ArrayList;
import java.util.List;

public class MatrixOp {

    public static List<Integer> spiralOrder(int[][] arr){
        List<Integer> list = new ArrayList<>();
        if (arr == null){
            return list;
        }
        int line = arr.length;
        int row = arr[0].length;
        int count = (Math.min(line,row)+1)/2;

        int i = 0;
        while (i<count){
            for (int j = i;j<row-i;j++){
                list.add(arr[i][j]);
            }
            for (int j=i+1;j<line-i;j++){
                list.add(arr[j][row-i-1]);
            }
            for (int j=row-i-2;j>i;j--){
                list.add(arr[line-i-1][j]);
            }
            for (int j=line-i-1;i<j& i<row-2;j--){
                list.add(arr[j][i]);
            }
            i++;
        }
        return list;
    }
}
