import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //插入
        list.add(10);
        list.add(0,1); //1插入到0位置
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list); //list的值尾插到list2
        List<Integer> list3 = new ArrayList<>(list);

        int index = list.indexOf(10);
        System.out.println(list.contains(1));//判断1是否在线性表中:true
        System.out.println(list.contains(100));//判断1是否在线性表中:false

        list.set(0,-1); //0的位置设置为-1
        System.out.println(list.get(0)); //获取下标0的元素：-1

        //截取下标0-2的元素，左闭右开
        List<Integer> subList = list.subList(0,2);
        System.out.println("subList：");
        for (int e : subList) {
            System.out.println(e);
        }

        List<String> subList2 = new ArrayList<>();
        System.out.println(subList2);

    }
}
