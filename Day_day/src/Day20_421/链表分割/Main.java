//给定链表和值x，对其进行分区，使得小于x的所有节点都在大于或等于x的节点之前。
//保留两个分区中每个分区中节点的原始相对顺序
package Day20_421.链表分割;
//思路：创建两个临时头节点pLeft,pRight,
//再创建两个节点,left和right，分别指向pLeft,pRight，用于在链表上移动
//遍历链表，使用判断条件,链表中数据值小于x，则把该节点链接到pLeft的后面，如果大于或等于，则链接到pRight后面
//注意一些节点的移动，比如说，(1)原链表的head 要指向head的下一个节点，(2)left 和 right指向链接后的节点
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static ListNode partition(ListNode pHead, int x) {
        ListNode pLeft = null;
        ListNode pRight = null;
        ListNode left = pLeft;
        ListNode right = pRight;
        ListNode cur = pHead;
        while (cur != null){
            if(cur.val < x) {
                if(pLeft == null){
                    left = pLeft = cur;
                }else{
                    left.next = cur;
                    left = cur;
                }
            } else{
                if(pRight == null){
                    right = pRight = cur;
                }else{
                    right.next = cur;
                    right = cur;
                }
            }
            cur = cur.next;
        }
        if (pLeft == null)
            return pRight;
        left.next = pRight;
        if (right != null)
            right.next = null;
        return pLeft;
    }

    public static void main(String[] args) {

    }
}
