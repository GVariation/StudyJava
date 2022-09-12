package TryLinkedHashMapAndTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //порядок не сохраняется
        HashMap<Integer, String> hashMap = new HashMap<>();

        // порядок совпадает с тем порядком как добавляли
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // сортируются по ключу (естественный порядок natural order)
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
