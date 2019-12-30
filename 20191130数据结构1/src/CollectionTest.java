//Collection接口操作集合元素的方法

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        System.out.println(c.size()); //2
        c.remove(6);
        System.out.println(c.size()); //1
        System.out.println(c.contains(6));  //false
        System.out.println(c.contains("孙悟空")); //true
        c.add(6);
        System.out.println(c);
    }
}
