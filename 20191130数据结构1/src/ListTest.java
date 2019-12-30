//List集合 有序可重复
//多了一个可以通过索引来操作集合元素

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("我爱中国！");
        books.add("好好学习");
        books.add("天天向上");
        System.out.println(books); //我爱中国！, 好好学习, 天天向上

        books.add(1 , "我爱学习");
    }
}

