import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        hashSet.add("Item1");
        hashSet.add("Item2");
        hashSet.addAll(Set.of("Item3", "Item4"));

        treeSet.add("Item5");
        treeSet.add("Item6");
        treeSet.addAll(Set.of("Item7", "Item8"));

        linkedHashSet.add("Item9");
        linkedHashSet.add("Item10");
        linkedHashSet.addAll(Set.of("Item11", "Item12"));

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        boolean containsItem2 = hashSet.contains("Item2");
        System.out.println("Does HashSet contain 'Item2'? " + containsItem2);

        treeSet.remove("Item6");
        System.out.println("TreeSet after removing 'Item6': " + treeSet);

        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        System.out.println("Iterating through TreeSet:");
        for (String item : treeSet) {
            System.out.println(item);
        }

        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
