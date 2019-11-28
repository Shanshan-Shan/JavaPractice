package 练习继承.FruitClass;

//简单的继承，此处Apple类基本只是一个空类
//创建apple对象之后，可以访问weight变量和info方法--继承
public class Apple extends Fruit {
    public static void main(String[] args) {
        Apple a = new Apple();

        a.weight = 50;
        a.info();
    }
}
