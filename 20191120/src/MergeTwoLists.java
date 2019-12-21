//合并两个链表
//.的地方要思考是否会为空

public class MergeTwoLists {
    private static Node MergeTwoLists(Node list1, Node list2) {
        //判断一些特殊情况


        Node cur1 = list1;
        Node cur2 = list2;

        Node nHead = null;
        Node nLast = null;

        while(cur1 != null && cur2 != null) {
            if(cur1.val <= cur2.val) {
                              //cur1尾插到新链表
                if(nHead == null) {
                    nHead = cur1;
                } else{
                    nLast.next = cur1;
                }
                nLast = cur1;  //
                cur1 = cur1.next;
            } else {           //cur2尾插到新链表

                if(nHead == null) {
                    nHead = cur2;
                } else{
                    nLast.next = cur2;
                }
                nLast = cur2;
                cur2 = cur2.next;
            }
        }

        //有一个链表空了
        if (cur1 != null) {
            nLast.next = cur1;
        } else {
            nLast.next = cur2;
        }
        return nHead;

    }

    public static void main(String[] args) {
        Node n5 = new Node(5);  //1 2 3 4 5
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        Node m3 = new Node(13);
        Node m2 = new Node(7, m3);
        Node m1 = new Node(0, m2);

        Node
    }
}
