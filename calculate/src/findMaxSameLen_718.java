public class findMaxSameLen_718 {
    public int findLength(int[] A, int[] B) {
        if (A == null || A.length == 0|| B == null || B.length == 0){
            return -1;
        }

        int lenA = A.length;
        int lenB = B.length;
        int max = 0;

        for (int i = 0;i<lenA;i++){
            for (int j = 0;j<lenB;j++){
                int k = 0;
                if(B[j] == A[i]){
                    while (i+k < lenA && j+k < lenB && B[j+k] == A[i+k]){
                        k++;
                    }
                }
                max = Math.max(max,k);
            }
            if(max >= lenA - i){
                break;
            }

        }

        return max;

    }
}
