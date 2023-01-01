package F02.F008Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // хранятся беспорядочно
        Set<String> linkedHashSet = new LinkedHashSet<>(); // порядок - как создавались
        Set<String> treeSet = new TreeSet<>(); // отсортированный порядок

        hashSet.add("Zena");
        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("Tom");

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        System.out.println(hashSet.isEmpty());

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println(hashSet);
    }
}
