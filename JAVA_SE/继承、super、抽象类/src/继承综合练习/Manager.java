package 继承综合练习;

import java.util.ArrayList;

//群主类
public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    //发红包的方法:红包分成若干份，需要放进一个集合里
    //定义一个方法三要素：方法名，返回值，参数
    public ArrayList<Integer> send(int totalMoney, int count){
        //红包金额totalMoney,分成count份
        ArrayList<Integer> redList = new ArrayList<>();
        //首先看一下群主红包余额
        int restMoney = super.getMoney();
        if(totalMoney > restMoney){
            System.out.println("余额不足！");
            return redList;
        }
        //其他情况，扣钱，重新设置群主余额
        super.setMoney(restMoney - totalMoney);

        //发红包分两种情况：整除/有余数，可以将余数包在最后一个红包里
        int target = totalMoney / count;
        int rest = totalMoney % count;

        for (int i = 0; i < count -1; i++) {
            redList.add(target);
        }
        redList.add(target + rest);
        //int last = target + rest;
        return redList;
    }
}
