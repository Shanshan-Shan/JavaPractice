package 接口practice;

//用接口功能
public class UseList {
    public static MyList selectYiFang() {
        return new MyLinkedList();
    }

    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        list.pushFront(5);
        list.pushFront(6);
        list.popFront();

    }
}
