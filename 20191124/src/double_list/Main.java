package double_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);
        System.out.println(list); //4 3 2 1

        list.popFront();
        list.popFront();
        list.popFront();
        System.out.println(list); //1

        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        System.out.println(list); //1 1 2 3 4

        list.popBack();
        list.popBack();
        list.popBack();
        System.out.println(list); //1 1


    }
}
