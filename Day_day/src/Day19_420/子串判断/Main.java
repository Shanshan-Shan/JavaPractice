package Day19_420.子串判断;

public class Main {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] bool = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(s.contains(p[i])){
                bool[i] = true;
            }else
                bool[i] =false;
        }
        return bool;
    }
    public static void main(String[] args) {

        String[] p = {"a","b","c","d"};
        int n = 4;
        String s = "abc";

       boolean[] re = (chkSubStr(p,n,s));
        for (int i = 0; i < n; i++) {
            System.out.print(re[i] + " ");
        }
    }
}
