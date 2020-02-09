package Test3;

// 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
// 判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
// 如果可以构成，返回 true ；否则返回 false。
// canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true

public class Code383 {
    public  boolean canConstruct(String ransomNote, String magazine) {
        //char[] ransom = ransomNote.toCharArray();  //用toCharArray方法将字符串转为数组
        char[] mag = magazine.toCharArray();
        //ransom的长度肯定要小于等于mag的长度
        if(ransomNote.length()> magazine.length()){
            return false;
        }
        for (int i = 0; i < ransomNote.length(); i++) {  //逐个拿出ransomNote每个字符
            int j = judge(mag, ransomNote.charAt(i));    //charAt-获取指定位置单个字符
            if(j != -1){
                mag[j] = '0';
            }else {
                return false;
            }
        }
            return true;
    }
    public int judge(char[] chars, char a){
        for (int i = 0; i < chars.length; i++) {
            if(a == chars[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magzine = "aab"; //true

        Code383 code383 = new Code383();
        boolean re = code383.canConstruct(ransomNote,magzine);
        System.out.println(re);
    }
}
