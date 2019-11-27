package double_list;

public class MyLinkedList {
    private Node head = null;
    private Node last = null;
    private int size = 0;

    //头插
    public void pushFront(int val) {
        Node node = new Node(val);  //要插入的新节点
        node.next = head;
        //双向链表有前驱和后继节点
        if (head != null) {
            head.prev = node;
        }
        head = node; //更新头节点？？？？？？？？？？

        if (head.next == null) {
            last = head;
        }
        size++;
    }

    //头删
    public void popFront() {
        if (size == 0) {
            throw new RuntimeException("空的");
        }

        head = head.next;
        if(head != null){
            head.prev = null;
        } else {
            last = null;
        }
        size--;
    }

    //尾插
    public void pushBack(int val) {
        Node node = new Node(val);

        if (last != null){
            last.next = node;
        } else {
            head = node;
        }
        node.prev = last;
        last = node;

        size++;
    }

    //尾删
    public void popBack() {
        //空链表
        if (size == 0) {
            throw new RuntimeException("空的");
        }

        if (last.prev != null) {
            last.prev.next = null;
            last = last.prev;
        } else {
            last = head = null;
        }

        size--;
    }

    @Override
    public String toString() {
        //链表打印成"1 --> 2 --> null"的格式
        String s = "";
        //遍历链表打印
        for(Node cur = head; cur != null; cur = cur.next) {
            s += String.format("%d -- >",cur.val);
        }
        s += null;

        return s;
    }
}
