//构造器练习理解
public class ConstructorTest {
    public String name;
    public int count;
    public double weight;

    //定义一个无参构造器
    //一个类至少有一个构造器
    //如果不定义，系统会默认这样一个无参构造器
    //自定义之后系统不会再提供构造器
    //构造器名字必须和类名一致
    public ConstructorTest (){

    }

    //构造器重载，仅形参列表不同
    //构造器是创建Java对象的重要途径
    public ConstructorTest(String name, int count) {
        this.name = name;
        this.count = count;
    }

    //在下面构造器中调用上面构造器的参数，使用this，且需要放在第一条语句
    public ConstructorTest(String name, int count, double weight) {
        this(name, count);
        this.weight = weight;
    }

    public static void main(String[] args) {
        ConstructorTest C1 = new ConstructorTest();
        ConstructorTest C2 = new ConstructorTest("考试",100);
        ConstructorTest C3 = new ConstructorTest("考试",100,20);

        System.out.println(C1.name + " " + C1.count ); //null；0
        System.out.println(C2.name + " " + C2.count ); //考试；100
        System.out.println(C3.name + " " + C3.count + " " + C3.weight); //考试；100；20.0

    }
}