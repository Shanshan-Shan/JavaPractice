package Test5;

//你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，按键可能会被长按，
// 而字符可能被输入 1 次或多次。
//你将会检查键盘输入的字符typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），
// 那么就返回 True。

//思路：对比两个数组对应位置元素，若不等，看是否等于前一个元素
public class Code925 {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int t = typed.length();
        for (int i = 0; i <= n-1; i++) {
            if (name.charAt(i) == typed.charAt(i)) {
                return true;
            } else if (name.charAt(i) == typed.charAt(i + 1)) {
                i++;
                return true;
            }
        }
        int i =0;
        if( i == n-1){
            for (int j = n; j < t; j++) {
                if (typed.charAt(j) == name.charAt(n - 1)) {
                    return true;
                }else{
                    return false;
                }
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        String name = "hss";
        String typed = "hhhhsssd";

        Code925 code925 = new Code925();
        boolean re = code925.isLongPressedName(name,typed);
        System.out.println(re);
    }
}
