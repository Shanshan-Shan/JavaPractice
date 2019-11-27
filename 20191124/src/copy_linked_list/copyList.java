package copy_linked_list;

//普通链表的复制
public class copyList {
    public  static Node copy(Node head) {
        Node nHead = null;
        Node nLast = null;

        Node cur = head;
        while (cur != null) {
            Node node = new Node(cur.val);

            if (nHead == null) {
                nHead = node;
            } else {
                nLast.next = node;
            }
            nLast = node;

            cur = cur.next;
        }
        return nHead;
    }
}
