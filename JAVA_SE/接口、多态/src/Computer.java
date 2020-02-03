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
        //向下转型--instanceof判断
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb; //向下转型
            mouse.click();
        }else if(usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb; //向下转型一定要先判断
            keyBoard.type();
        }
        usb.turnOff(); //关闭设备
    }
}
