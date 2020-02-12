package Test4;

//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，
// 使得 num1 成为一个有序数组。

//思路：
public class Code88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n -1;
        int k = m+n-1;//从后面sum1空的的往前存储

        if (nums1 == null || nums2 == null) {
            System.out.println("there is a null arr");
            return ;
        }
        /** source的长度和已有M不匹配 */
        if (m > nums1.length) {
            System.out.println("the length unmatch with m");
            return ;
        }

        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            }else {
                nums1[k--] = nums2[j--];
            }
        }

        while(j >= 0)//先存储完sum1剩下sum2的继续存储sum1里面
            nums1[k--] = nums2[j--];
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int[] nums2 = {2,4,6,8};
        int m =nums1.length;
        int n = nums2.length;

        Code88 code88 = new Code88();
        code88.merge(nums1, m, nums2, n);
    }
}
