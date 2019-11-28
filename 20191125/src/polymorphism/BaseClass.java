package polymorphism;

//多态--polymorphism
public class BaseClass {
    public int book = 6;

    public void base () {
        System.out.println("我是父类的方法");
    }

    public void test(){
        System.out.println("我是父类被隐藏的方法");
    }
}
