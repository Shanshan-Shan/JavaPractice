package Test2;

//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
// 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//假设数组中无重复元素。

//示例 1: 输入: [1,3,5,6], 5    输出: 2
//示例 2: 输入: [1,3,5,6], 2    输出: 1
public class Code35 {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(nums[n-1] < target){  //要找的是最大的，插在最后一位
            return n;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == target){
                return j;
            }
        }
        for (int i = 0; i < nums.length; i++) {  //遍历数组
            if(nums[i] < target && target < nums[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6};
        int target = 5; //返回3
        int re = searchInsert(nums, target);

        System.out.println(re);
    }
}
