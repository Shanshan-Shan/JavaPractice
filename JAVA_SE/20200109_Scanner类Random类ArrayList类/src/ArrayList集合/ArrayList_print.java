package ArrayList集合;

import java.util.ArrayList;

//ArrayList可以作为方法的参数
/*
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
        格式参照 {元素@元素@元素}。
        System.out.println(list);       [10, 20, 30]
        printArrayList(list);           {10@20@30}
*/
public class ArrayList_print {

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size() - 1){
                System.out.print(list.get(i) + "@");
            }else{
                System.out.print(list.get(i) + "}");
            }

        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("杨幂");
        list.add("刘恺威");
        list.add("唐嫣");
        printArrayList(list);
    }
}
