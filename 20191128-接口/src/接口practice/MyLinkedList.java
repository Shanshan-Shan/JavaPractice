package 接口practice;

//实现接口的功能，关键字implement
//简单实现单链表的头插尾插
public class MyLinkedList implements MyList{
    private Node head;
    int size = 0;

    //实现接口的头插
    @Override
    public void pushFront(int element) {
        Node node = new Node();
        node.val = element;
        node.next = head;
        head = node;
    }

    //实现接口的头删
    @Override
     public void popFront() {
        head = head.next;
    }

}
