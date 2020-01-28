package 继承综合练习;

//用户类，模拟微信群发红包场景
public class User {
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int count) {
        this.name = name;
        this.money = count;
    }

    //自定义一个显示方法
    public void show(){
        System.out.println("我的名字是：" + name + "我的余额是：" + money);
    }
    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int count) {
        this.money = count;
    }
}
