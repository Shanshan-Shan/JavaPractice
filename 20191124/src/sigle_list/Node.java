package sigle_list;

//定义一个类Node
public class Node {
    //定义Node类的两个属性
    int val;
    Node next;

    //定义构造器--初始化属性
    //构造器用于创建对象时初始化，构造器是创建对象的重要途径
    public Node(int val) {
        this.val = val;
    }
    //构造器的重载，名字一样，都和类名一样，参数列表不一样
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

}
