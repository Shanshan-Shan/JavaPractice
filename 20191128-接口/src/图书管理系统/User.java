package 图书管理系统;

public abstract class User {

    //抽象方法
    //抽象类--接口中不可以定义属性，所以只能定义抽象类
    public String name;

    public abstract void menu(); //展示菜单
    public abstract void opration(int select); //操作

}
