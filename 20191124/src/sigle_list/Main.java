package sigle_list;
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        list.printLinkedList();  //printLinkedList是普通方法
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.printLinkedList();
        list.popFront();
        list.popFront();
        list.popFront();
        list.printLinkedList();
        list.popFront();
        list.printLinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.printLinkedList();
        list.popBack();
        list.popBack();
        list.popBack();
        list.printLinkedList();
        list.popBack();
        list.printLinkedList();
        list.popBack();
        list.printLinkedList();
    }

}
