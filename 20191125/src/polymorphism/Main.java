package polymorphism;

public class Main {
    public static void main(String[] args) {
        BaseClass bc = new BaseClass();

        System.out.println(bc.book);
        bc.base();
        bc.test();

        SubClass sc = new SubClass();

        System.out.println(sc.book);
        sc.sub();
        sc.test();
        //上面两种调用编译运行一样，不存在多态
        //因为调用的变量和方法非常正常

        //下面这个编译类型是Base Class；运行类型是SunClass
        BaseClass Bc = new SubClass();
        System.out.println(Bc.book);  //6--访问的是父类对象的变量
        Bc.base();
        Bc.test(); //有名相同的方法，运行的是子类的方法--多态的体现
    }
}
