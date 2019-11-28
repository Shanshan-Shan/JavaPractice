package 练习继承;

public class Dog extends Animal{

    String host;
    Dog(String host) {
        super(1, 3);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public void bark(){
        System.out.println("汪汪");
    }

    public static void sleep (){
        System.out.println("我是Dog的睡觉");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小明");

        dog.bark();
        System.out.println(dog.getHost());
        System.out.println(dog.getColor());       //调用父类的方法
        System.out.println(dog.getNumberOfLegs());//调用父类的方法
    }
}
