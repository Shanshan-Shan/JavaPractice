//鼠标类，打开/关闭鼠标
//实现接口功能，覆写接口方法
public class Mouse implements USB{
    @Override
    public void turnOn() {
        System.out.println("打开鼠标");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭鼠标");
    }
}
