package 练习继承.this_super;

//this和super是作用于对象的，不能出现在static修饰的方法中，因为static是属于类的
public class SubClass extends BaseClass {
    public int a = 7;  //定义了和父类重名的变量

    //如果子类定义了和父类同名的变量，默认调用的是子类的
    public void accessOwner(){
        System.out.println(a);
    }

    //子类方法中可以通过super.来调用父类被隐藏的变量
    //如果子类没有和父类重名的变量，可以不用super，直接调用
    public void accessBase(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();

        sc.accessOwner(); //7
        sc.accessBase();  //5


    }


}
