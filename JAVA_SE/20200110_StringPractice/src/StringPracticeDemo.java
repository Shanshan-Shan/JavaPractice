// 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。
// 格式参照如下：[word1#word2#word3]
//思路：
//1.定义方法：数组转为字符串
// 三要素--方法名fromArrayToString，返回值String，参数array
public class StringPracticeDemo {
    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str = str + "word" + array[i] + "]";
            }else{
                str = str + "word" + array[i] + "#";
            }
        }
        //return str + "]";
        return str;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }
}