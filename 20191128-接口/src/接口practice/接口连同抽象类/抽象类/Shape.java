package 接口practice.接口连同抽象类.抽象类;

//abstract修饰类，表示这个类只能被继承，
//abstract修饰方法表示这个方法需要子类重写
//抽象类不能创建实例，只能被继承
public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块...");
    }
    private String color;
    public abstract double calPerimeter();  //计算Perimeter--周长的抽象方法
    public abstract String getType();       //返回形状的抽象方法

    public Shape(){}

    public Shape(String color){
        System.out.println("执行Shape的构造器...");
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
