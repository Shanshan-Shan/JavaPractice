import java.util.Arrays;

//使用Arrays相关的API，
//将一个随机字符串中的所有字符升序排列，并倒序打印。
//思路：1.自定义一个无序数组，字符串变数组，toCharArray。
// 2.对数组升序sort. 3.倒序打印
public class DemoArraysPractice {
    public static void main(String[] args) {
        String str = "jshhashg27danba"; //自定义一个无序数组
        char[] chars = str.toCharArray(); //字符串变数组,并接收

        String str2 = Arrays.toString(chars); //toString的用法
        System.out.println(str2); //[j, s, h, h, a, s, h, g, 2, 7, d, a, n, b, a]

        Arrays.sort(chars); //调用Arrays类的sort方法对数组升序
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
