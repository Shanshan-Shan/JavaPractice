package polymorphism.instanceOf运算符;

//instanceof运算符可以让强制类型转换更安全
public class InstanceOfTest {
    public static void main(String[] args) {
        //声明hello是Object类型，则编译类型为Object，实际类型是String
        Object hello = "hello";
        //String与Object存在继承关系，返回true；
        System.out.println("字符串是否是Object的实例：" + (hello instanceof Object));
        System.out.println("字符串是否是String类的实例：" + (hello instanceof String));

        //false
        //Math和Object具有继承关系，可以这样运算
        System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));

        String a = "hello";
        //字符串和Math之间没有继承关系，编译不通过
        //System.out.println("字符串是否是Math的实例：" + (a instanceof Math));

    }
}
