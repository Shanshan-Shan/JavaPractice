//简单链表的复制

public class SimpleList {
    private static class Node{
        int val;
        Node next;
    }

    public static void main(String[] args) {
        Node head = null;
        Node node;
        //就地头插1
        node = new Node();
        node.val = 1;
        node.next = head;
        head = node;

        //就地打印
        for(Node c = head; c != null; c = c.next){
            System.out.println(c.val);
        }

        //就地尾插2
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = new Node();
        last.next.val = 2;

        //就地打印
        for(Node c = head; c != null; c = c.next){
            System.out.println(c.val);
        }

        //就地复制
        Node result = null;
        Node resultLast = null;
        for(Node c = head; c != null; c = c.next){
            Node newNode = new Node();
            newNode.val = c.val;
            if (result == null){
                result = newNode;
            }else {
                resultLast.next = newNode;
            }
            resultLast = newNode;
        }

        //就地打印
        for(Node c = result; c != null; c = c.next){
            System.out.println(c.val);
        }

    }
}
