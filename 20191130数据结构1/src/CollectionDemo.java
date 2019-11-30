import java.util.ArrayList;
import java.util.Collection;

//接口练习
//collection--存储一组元素
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("我");
        list.add("爱");
        list.add("中国");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Object[] array = list.toArray();
        for (String s: list) {
            System.out.println(s);
        }
    }
}
