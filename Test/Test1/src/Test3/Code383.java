package Test3;

// 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
// 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
// 如果可以构成，返回 true ；否则返回 false。

public class Code383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        //char[] ransom = ransomNote.toCharArray();  //用toCharArray方法将字符串转为数组
        char[] mag = magazine.toCharArray();
        //ransom的长度肯定要小于等于mag的长度
        if(ransomNote.length()> magazine.length()){
            return false;
        }
        for (int i = 0; i < ransom.length; i++) {
            for (int j = 0; j < mag.length; j++) {
                if(ransom[i] != mag[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "abc";
        String magzine = "abcd"; //true
        boolean re = canConstruct(ransomNote, magzine);
        System.out.println(re);
    }
}
