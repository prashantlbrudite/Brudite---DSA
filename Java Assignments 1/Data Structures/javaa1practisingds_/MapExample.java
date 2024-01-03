
import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        hashMap.put("Key1", 1);
        hashMap.put("Key2", 2);
        treeMap.put("Key3", 3);
        linkedHashMap.put("Key4", 4);

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        int valueForKey1 = hashMap.get("Key1");
        System.out.println("Value for 'Key1' in HashMap: " + valueForKey1);

        boolean containsKey2 = treeMap.containsKey("Key2");
        System.out.println("Does TreeMap contain 'Key2'? " + containsKey2);

        linkedHashMap.remove("Key4");
        System.out.println("LinkedHashMap after removing 'Key4': " + linkedHashMap);

        System.out.println("Size of HashMap: " + hashMap.size());
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        System.out.println("Key set of LinkedHashMap: " + linkedHashMap.keySet());
        System.out.println("Values of TreeMap: " + treeMap.values());

        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
