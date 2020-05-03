package Day22_423.链式AB;

//考虑用递归
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode plusAB(ListNode a, ListNode b) {
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        return plusAB(a,b,0);
    }
    public ListNode plusAB(ListNode a, ListNode b, int sum) {
        if(a == null && b == null && sum == 0){
            return null;
        }
        if(a != null){
            sum += a.val;
        }
        if(b != null){
            sum += b.val;
        }
        ListNode node = new ListNode(sum % 10);
        node.next = plusAB(a !=null ? a.next:null, b !=null ? b.next:null);
        return node;
    }
    public static void main(String[] args) {

    }
}
