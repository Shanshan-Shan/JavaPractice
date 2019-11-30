import java.util.HashMap;
import java.util.Map;

//练习Map接口
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        map.put("作者", "鲁迅");
        map.put("标题", "狂人日记");

        for(Map.Entry<String, String> entry: map.entrySet())
            System.out.println(entry.getKey()
                    + "--->" + entry.getValue());
    }
}
