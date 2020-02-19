package Test5;

//你的朋友正在使用键盘输入他的名字name。偶尔，在键入字符c时，按键可能会被长按，
// 而字符可能被输入 1 次或多次。
//你将会检查键盘输入的字符typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），
// 那么就返回 True。

//思路：对比两个数组对应位置元素，若不等，看是否等于前一个元素
//长按的情况必须要满足name中的每个字符按照顺序出现在typed中，并且typed中不能出现name中没有的字符。
public class Code925 {
    public boolean isLongPressedName(String name, String typed) {
        int len1=name.length();
        int len2=typed.length();
        int i=0;
        int j=0;

        while(i<len1){
            boolean flag=false;
            int num1=1;
            int num2=0;
            while(j<len2&&name.charAt(i)==typed.charAt(j)){//在typed中查找name中的字符
                flag=true;//查到了
                j++;
                num2++;
            }
            if(!flag) {//没查到
                return false;
            }
            i++;
            while(i<len1&&name.charAt(i)==name.charAt(i-1)){
                num1++;
                i++;
            }
            if(num1>num2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "hss";
        String typed = "hhhhsssd";

        Code925 code925 = new Code925();
        boolean re = code925.isLongPressedName(name,typed);
        System.out.println(re);
    }
}
