package Test2;

//给定一个数组 nums 和一个值 val，
//需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
public class Code27 {
    public static int removeElement(int[] nums, int val) {
        //考虑特殊情况，数组为空或者数组长度为0，返回0
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j; //返回移除元素之后数组的长度j
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2};
        int val = 2;    //返回新数组长度4，数组前四个元素为1，3，4，5
        int re = removeElement(nums,val);
        System.out.println(re);
        System.out.println("=============");
        for (int i = 0; i < re; i++) {
            System.out.print(nums[i]);
        }
    }
}
