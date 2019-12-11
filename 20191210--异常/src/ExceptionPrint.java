//练习异常
//找异常的方法：一般主要的在前面
public class ExceptionPrint {
    private static void methodA(){
        throw new MyException("我是异常");
    }
    private static void methodB(){
        methodA();
    }
    private static void methodC(){
        methodB();
    }

    public static void main(String[] args) {
        methodC();
    }
}
