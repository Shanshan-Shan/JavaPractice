package 接口practice.接口连同抽象类.包装类.PrimitiveString;

//包装类可以实现基本类型转字符串
public class Primitive2String {
    public static void main(String[] args) {
        String intStr = "123";
        //字符串转化为基本类型的方法1--利用包装类提供的parse..静态方法
        int inta = Integer.parseInt(intStr);
        System.out.println(inta);//123
        //把基本类型变量intStr当成对象来使用
        //自动拆箱，装箱，系统自己完成
        //字符串转化为基本类型的方法2--利用包装类的构造器
        int intb = new Integer(intStr);
        System.out.println(intb); //123

        String floatStr = "3.14";
        float ft1 = Float.parseFloat(floatStr);
        System.out.println(ft1); //3.14
        float ft2 = new Float(floatStr);
        System.out.println(ft2); //3.14

        //基本类型转化为字符串
        String ftStr = String.valueOf(2.345f); //float变量转化为字符串
        System.out.println(ftStr);
        //String类提供了多个重载valueOf()方法，可以将基本类型转化为字符串
        String dbStr = String.valueOf(3.666);  //double变量转化为字符串
        System.out.println(dbStr);
        String boolStr = String.valueOf(true);
        System.out.println(boolStr); //true
        //字符串转为大写
        System.out.println(boolStr.toUpperCase());//TRUE

    }
}
