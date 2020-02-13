package Test5;

//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。
//如果数组中每个元素都不相同，则返回 false。

//import java.lang.reflect.Array;
import java.util.Arrays;

//思路1：用两个数组，两层循环，逐个判断是否相等
public class Code217 {
   public boolean containsDuplicate(int[] nums) {
        int[] arr = nums.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(arr[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0}; //true
        Code217 code217 = new Code217();
        boolean re = code217.containsDuplicate(nums);
        System.out.println(re);
    }


}
