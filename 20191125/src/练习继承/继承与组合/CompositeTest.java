package 练习继承.继承与组合;
//组合练习
class Animal {
    //父类定义private方法，不能被子类访问
    private void beat(){
        System.out.println("心脏跳动...");
    }
    //public方法子类可以直接继承
    public void breath(){
        beat();
        System.out.println("呼吸中...");
    }
}
//将原来的父类组合到原来的子类，作为子类的一个组合部分
class Bird{
    //将原来的父类组合到原来的子类，作为子类的一个组合部分
    private Animal a;
    public Bird(Animal a){
        this.a = a;
    }

    //重新定义一个自己的breath方法
    public void breath(){
        //直接复用Animal的breath方法
        a.breath();
    }

    public void fly(){
        System.out.println("我可以在天空飞翔...");
   }
}
public class CompositeTest {
    public static void main(String[] args) {
        //组合需要显式创建被组合的对象
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();

    }
}
