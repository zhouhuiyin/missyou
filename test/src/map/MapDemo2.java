package map;

import java.util.*;

/**
 * map 遍历
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",96);
        map.put("物理",99);
        map.put("化学",90);
        map.put("体育",68);
        System.out.println(map);
        //遍历所有的key set keySet()
        Set<String> keySet = map.keySet();
        for(String str : keySet){
            System.out.println(str);
        }
        //遍历所有的键值对
        Set<Map.Entry<String,Integer>> entrySet =map.entrySet();

        for(Map.Entry<String,Integer> e : entrySet){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //遍历所有的value
        Collection<Integer> collection = map.values();
        for(Integer value : collection){
            System.out.println(value);
        }
        //lambada表达式遍历
        map.forEach(
                (k,v)-> System.out.println(k+":"+v)
        );
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.forEach(
                e -> System.out.println(e)
        );

    }
}
