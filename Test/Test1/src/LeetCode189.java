//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//分析：1.对K进行处理，确定移动几位
//      2.每一位的值都赋给下一位，最后一位的值赋给第一位

//1234567
//6712345
public class LeetCode189 {
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7};
        int k = 2;
        rotate(nums,k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
