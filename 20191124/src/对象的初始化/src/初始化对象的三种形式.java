public class 初始化对象的三种形式 {
    // 3. 构造方法中初始化
    初始化对象的三种形式() {
        this(0);
        System.out.println(100);
    }

    初始化对象的三种形式(int v) {
        System.out.println(10000);
    }

    {
        System.out.println(1000);
    }

    private int a = initA();  // 1. 定义时初始化

    {
        System.out.println(10);
    }

    private int initA() {
        System.out.println(0);
        return 0;
    }

    public static void main(String[] args) {
        new 初始化对象的三种形式();
    }
}
