package polymorphism;

//多态--polymorphism
public class SubClass extends BaseClass {
    public int book = 8;

    public void sub(){
        System.out.println("我是子类的方法");
    }

    public void test() {
        System.out.println("我是覆盖父类的子类的方法");
    }
}
