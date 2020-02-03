public class Main {
    public static void main(String[] args) {
    Computer computer = new Computer();
    computer.powerOn();
    //准备一个鼠标，用多态写法--向上转型：左父右子
    USB usbMouse = new Mouse();  //多态写法
    computer.useUsb(usbMouse);

    //创建一个USB键盘
    KeyBoard keyBoard = new KeyBoard();
    computer.useUsb(keyBoard);  //这样写也对，
                                // 没用多态写法，但也实现了向上转型
    computer.powerOff();
    }
}
