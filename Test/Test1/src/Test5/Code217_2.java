package Test5;

import java.util.Arrays;
//思路2：排序算法
//如果存在重复元素，排序后它们应该相邻。
public class Code217_2 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);     //对nums进行排序，默认升序
        for (int i = 0; i < nums.length-1; i++) {  //nums.length-1,,
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,0,0}; //true

        Code217_2 code217_2 = new Code217_2();
        boolean re = code217_2.containsDuplicate(nums);
        System.out.println(re);
    }
}
