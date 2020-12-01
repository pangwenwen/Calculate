package two_poniter;

public class minwindow_76 {

    public static void main(String[] args) {
        String ff = "feddr";
        System.out.println(ff.substring(0,2));
    }

    public String minWindow(String s, String t) {
        char[] chars = {};
        if (s == null || t== null){
            return chars.toString();
        }

        int l = 0;
        int r = -1;

        int[] res = new int[256];
        for (int i = 0;i<t.length();i++){
            res[t.charAt(i)] = 1;
        }

        int n = t.length();
        String temp = null;

        int x = 0;
        while (r+1<s.length()){
            if (t.indexOf(s.charAt(r+1))>0){
               x++;
               r++;
            }else {
                r++;
                l++;
            }

            if (x == n){
                if (temp == null || temp.length()>r-l+1){
                    temp = s.substring(l,r+1);
                }


            }
        }

        return "";

    }
}
