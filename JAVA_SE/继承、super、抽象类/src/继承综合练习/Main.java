package 继承综合练习;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member a = new Member("张三",10);
        Member b = new Member("李四",20);
        Member c = new Member("王五",30);

        manager.show();
        a.show();
        b.show();
        c.show();
        System.out.println("======================");

        //群主发红包，20元，分3个
        ArrayList<Integer> redList = manager.send(20,3);
        a.receive(redList);
        b.receive(redList);
        c.receive(redList);

        manager.show();
        a.show();
        b.show();
        c.show();

    }
}
