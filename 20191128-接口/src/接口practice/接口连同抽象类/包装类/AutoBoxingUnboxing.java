package 接口practice.接口连同抽象类.包装类;

//自动装箱，自动拆箱功能--简化了基本类型和包装类之间的转换
//自动装箱：把一个基本类型变量直接赋给对应的包装类变量/object变量
//自动拆箱：把包装类对象直接赋给对应的基本类型变量
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer a = 5;  //自动装箱：直接把一个基本类型变量赋给Integer对象
        Object b = true;//自动装箱
        int i = a;//自动拆箱：直接把一个Integer对象赋给int类型的变量
        if(b instanceof Boolean) {
            //把object对象b强制转换成Boolean类型，再赋给boolean变量
            boolean j = (Boolean)b;
            System.out.println(j);
        }
    }
}
