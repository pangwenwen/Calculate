import java.net.MalformedURLException;
import java.net.URL;

public class testI {

    public static void main(String[] args) throws MalformedURLException {
//        int[] array = new int[]{5,3,8,1,0,7};
//        buf(array);
//        int len = array.length;
//        for (int i = 0;i<len;i++){
//            System.out.print(array[i]);
//            System.out.print(" ");
//        }
        URL url = new URL("http://a.g.b.r.b.letvimg.com");
        String a = url.getHost();
        System.out.println(a);
        String LETVIMG = ".letvimg.com";
        final String LETVIMG_MG = "-img-letv.yyssh.mgtv.com";
        String newDomain = null;
        if (a.contains(".letvimg.com")){
            String subU = a.substring(0,a.indexOf(LETVIMG));
            String subNew = a.replace(subU,subU.replace('.','-'));
            newDomain = subNew.replace(LETVIMG, LETVIMG_MG);
        }
        System.out.println(newDomain);
//        String b = a.replace('.','-');
//        System.out.println(b);
    }

    private static void buf(int[] array){
        if (array == null || array.length == 0){
            return;
        }

        boolean isS = false;
        int temp;
        int len = array.length;
        for (int i = 0;i<len;i++){
            for (int j= len - 1;j>i;j--){
                if (array[j] <array[j-1]){
                    isS = true;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            if (!isS){
                break;
            }
        }
    }

    private  static void quick(int[] array){


    }
}
