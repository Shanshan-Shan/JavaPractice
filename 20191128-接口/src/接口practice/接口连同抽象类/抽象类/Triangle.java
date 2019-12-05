package 接口practice.接口连同抽象类.抽象类;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(String color , double a , double b , double c ){
        super(color);
        this.setSide(a,b,c);
    }

    public void setSide(double a , double b , double c){
        if( a >= b + c || b >= a + c || c >= a + b ){
            System.out.println("三角形两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //重写父类的方法
    public double calPerimeter(){
        return a + b + c;
    }
    public String getType(){
        return "三角形";
    }
}
