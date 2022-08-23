package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",96);
        map.put("物理",99);
        map.put("化学",90);
        Integer m = map.put("化学",80);
        Integer s = map.get("语文");
        System.out.println(map);
        System.out.println(m);
        System.out.println(map.get("化学"));
        String s1 = s+"d";
        System.out.println(s.toString());
        map.remove("化学");
        int a = map.size();
        System.out.println(a);
        System.out.println(map.containsKey("语文"));
        System.out.println(map.containsValue(99));
    }
}

