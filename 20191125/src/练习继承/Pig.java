package 练习继承;

public class Pig extends Animal{
    String house = "猪窝";

    Pig() {
        super();  //继承父类的变量和方法
    }

    //重写父类的方法
    public void bark(String target){
        System.out.println("哼哼 to " + target);
    }

    public static void main(String[] args) {
        Pig p = new Pig();
        p.bark("我");
        p.bark();
    }

}
