package 练习继承;

//练习继承，重载。覆写

public class Animal {
    //属性
    int color;
    int numberOfLegs;

    //构造器，子类继承的话，可以获得父类的全部变量和方法
    //java的子类不能获得父类的构造器
     Animal(int color, int numberOfLegs){
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }

    Animal(){
         this(0, 4);
    }

    public int getColor() {
         return color;
    }

    public int getNumberOfLegs() {
         return numberOfLegs;
    }

    public void bark() {
        System.out.println("吱吱");
    }

    public static void sleep() {
        System.out.println("我是Animal的睡觉");
    }
}