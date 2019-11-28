package 练习继承.this_super;

//调用父类的构造器，通过super
//子类不会获得父类的构造器，但可以获得父类构造器的初始化代码
//super和this的调用很像，区别是super调用的是父类的构造器
//this调用的是同类中重载的构造器，都必须出现在第一行
public class Sub extends Base{
    public String color;

    //调用父类构造器。获得父类构造器的初始化代码
    public Sub(String name, double a, String color){
        super(name, a);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub("对象", 6.6, "红色");

        //输出Sub的三个变量
        System.out.println(s.name + "--" + s.a + "--" +s.color);
    }
}
