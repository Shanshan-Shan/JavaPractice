package Test6;
//仅仅反转字母
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

//思路：先把输入的字符串转换成字符数组，char[] s=S.toCharArray();
//之后运用双指针（一个指前left，一个指后right）
//if（left指的内容不是字母）则left++； else if（right所指的内容不是字母）则right–

// char c='a';
// Character.isLetter(c);        如果是字母返回true，如果不是字母返回false
// Character.isDigit(c);         如果是数字返回true，如果不是数字返回false
// Character.isLowerCase(c);     如果是小写字母返回true，如果不是小写字母返回false
// Character.isUpperCase(c);     如果是大写字母返回true，如果不是大写字母返回false
// Character.isLetterOrDigit(c); 如果是字母或者数字返回true，如果不是字母或者数字返回false

//else//这个就是left和right指的都是字母的情况 ，交换left和right所指的内容
//最后把字符数组转换成字符串之后返回

//将字符数组转化成字符串--char[] s={'a','b','c'};
// String S=String.valueOf(s);  最后S字符串是"abc"；

public class Code917 {
    public String reverseOnlyLetters(String S) {
        char[] str = S.toCharArray();
        int left = 0;              //指向左边
        int right = str.length-1;  //指向右边
        while (left <= right){
            if(!Character.isLetter(str[left])){
                left++;   //左边不是字母的时候left++
            }else if(!Character.isLetter(str[right])){
                right--;  //右边不是字母的时候 right--
            }else{     //左边右边都是字母,交换left和right
                char tmp = '0';
                tmp = str[left];
                str[left] = str[right];
                str[right] = tmp;

                left++;
                right--;
            }
        }
        S = String.valueOf(str);
        System.out.println(S);
        return S;
    }

    public static void main(String[] args) {
        String S = "hss-H-S-S"; //输出：SSH-s-s-h；
        System.out.println(S);
        Code917 code917 = new Code917();
        code917.reverseOnlyLetters(S);
    }
}
