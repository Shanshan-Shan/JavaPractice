package 接口practice.接口连同抽象类.抽象类;

public class Circle extends Shape {
    private double radius; //radius--半径
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //重写父类的方法
    public double calPerimeter(){
        return 2 * Math.PI  * radius;
    }
    public String getType(){
        return  "圆形";
    }

    public static void main(String[] args) {
        Shape s1 = new Triangle("黑色", 3,4 ,5 );
        Shape s2 = new Circle("黄色",3);
        System.out.println(s1.getColor());
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());

        System.out.println(s2.getColor());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}
