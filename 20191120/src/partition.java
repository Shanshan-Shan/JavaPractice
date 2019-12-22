//将链表分割

//特殊情况：
public class partition {
    public static Node partition(Node head, int x) {
       //定义两个节点
        Node cur = head;
        Node sHead = null;
        Node sLast = null;
        Node bHead = null;
        Node bLast = null;

        while (cur != null) {
            if (cur.val < x) {
                if (sHead == null) {  //尾插的代码
                sHead = cur;
            } else {
                sLast.next = cur;
            }
            sLast = cur;             //尾插的代码
            } else {
                if (bHead == null) {
                    bHead = cur;
                } else {
                    bLast.next = cur;
                }
                bLast = cur;  //
            }
            cur = cur.next;
        }
        sLast.next = bHead;
        bLast = null;

        return sHead;


    }


    public static void main(String[] args) {
        Node n5 = new Node(9);  //1 2 3 4 5
        Node n4 = new Node(7, n5);
        Node n3 = new Node(1, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(5, n2);


    }
}
