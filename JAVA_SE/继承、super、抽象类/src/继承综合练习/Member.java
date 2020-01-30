package 继承综合练习;

import java.util.ArrayList;
import java.util.Random;

//群成员收红包
public class Member extends User{
    public Member() {
    }

    public Member(String name, int count) {
        super(name, count);
    }

    //收红包的方法:返回值，方法名，参数列表
    public void receive(ArrayList<Integer> list){
        //从多个红包中随机抽取一个红包，给自己
        //随机获取索引
        int index = new Random().nextInt(list.size());
        //根据索引删除红包，给自己
        int rand = list.remove(index);

        //拿出成员的余额
        int rest = super.getMoney();
        //抽取的红包给自己
        super.setMoney(rest + rand);

    }
}
