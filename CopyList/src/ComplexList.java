//复杂链表的复制

public class ComplexList {
    private static class Node {
        int val;
        Node random;
        Node next;
    }

    static Node copy(Node head) {
        if (head == null) {
            return null;
        }
        Node cur;
        cur = head;
        while (cur != null) {
            Node newNode = new Node();
            newNode.val = cur.val;
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        cur = head;
        while (cur != null) {
            Node newNode = cur.next;
            if (cur.random != null) {
                newNode.random = cur.random.next;
            }
            cur = newNode.next;
        }
        cur = head;
        Node result = head.next;
        while (cur != null) {
            Node newNode = cur.next;
            cur.next = newNode.next;
            if (newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            cur = cur.next;
        }
        return result;
    }
}
