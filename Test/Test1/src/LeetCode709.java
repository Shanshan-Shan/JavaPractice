//题目：实现函数 ToLowerCase()，该函数接收一个字符串参数 str，
//并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

//思路：1.字符串转char数组--String方法中的 toCharArray();
//      2.遍历数组，
//      3.判断如果大写就转小写.
// PS:065-090：A-Z  097-122：a-z    大写转小写：+32
public class LeetCode709 {
    public String ToLowerCase(String str){
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] += 32;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String str = "LOVE";
        LeetCode709 leetCode709 = new LeetCode709();

        System.out.println(leetCode709.ToLowerCase(str));
    }
}
