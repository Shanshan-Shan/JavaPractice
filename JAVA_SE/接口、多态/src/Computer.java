//笔记本电脑类
//开机，关机，使用USB接口
public class Computer {
    public void powerOn(){
        System.out.println("电脑开机！");
    }
    public void powerOff(){
        System.out.println("电脑关机！");
    }

    //使用USB，接口作为方法的参数
    public void useUsb(USB usb){
        usb.turnOn(); //打开设备
        usb.turnOff(); //关闭设备
    }
}
