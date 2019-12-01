package polymorphism.引用变量的强制类型转换;

//引用变量的强制类型转换
//基本类型只能在数值类型之间转换
//引用数据类型只能在具有继承关系的两个类型之间转换
public class ConversationTest {
    public static void main(String[] args) {
        double d = 3.14;
        long l = (long) d;
        System.out.println(l);
        int i = 5;
        //数值类型和布尔类型之间不能进行类型转换
        //boolean b = (boolean)i;//错误

        //o的编译类型为Object，Object和toString具有继承关系，可以强制转换
        Object o = "Hello";
        String os = (String)o;
        System.out.println(os);

        //定义一个op变量，编译类型是Object，实际类型是Integer
        Object op = new Integer(5);

        //会抛出一个异常；编译没问题，但运行异常
        //String str = (String)op;


    }
}
