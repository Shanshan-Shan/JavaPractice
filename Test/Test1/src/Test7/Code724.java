package Test7;

//给定一个整数类型的数组nums，请编写一个能够返回数组“中心索引”的方法。
//数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
//如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。

//思路：中心索引左边的和=数组总和-nums[i]-左边的和
public class Code724 {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        if(nums.length == 0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            if(leftsum == sum - nums[j] - leftsum){   //重点--找到这个关系
                return j;
            }
            leftsum += nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,2,4,5,6}; //-1
        int re = pivotIndex(nums);
        System.out.println(re);
    }
}
