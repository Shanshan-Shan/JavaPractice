//键盘类，打开/关闭键盘
public class KeyBoard implements USB{
    @Override
    public void turnOn() {
        System.out.println("打开键盘");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
