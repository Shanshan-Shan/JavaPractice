package Anonymous;
import java.util.Scanner;

//匿名对象
//可以作为方法的参数和返回值
/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
new 类名称();

注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象。
 */
public class AnonymousDemo {
    //匿名对象作为方法的返回值
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

    //匿名对象作为方法的参数
    public static void method(Scanner sc){
        System.out.println("请输入一个数字：");
        int num =  new Scanner(System.in).nextInt();
        System.out.println("输入的数字是：" + num);

    }

    public static void main(String[] args) {
        //普通方法的使用
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("输入的数字是：" + a);

        //匿名方法的使用
        System.out.println("请输入一个数字：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是：" + b);

        //使用匿名对象传参
        method(new Scanner(System.in));

        //匿名对象作为方法的返回值
        Scanner c = methodReturn();
        int n = c.nextInt();
        System.out.println("输入的数字是：" + n);
    }
}
