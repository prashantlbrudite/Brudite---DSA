import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item1");
        arrayList.addAll(Arrays.asList("Item3", "Item4", "Item5"));
        System.out.println("Elements in the list: " + arrayList);

        System.out.println("Iterating through the list:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        arrayList.set(1, "ModifiedItem2");
        System.out.println("Modified list: " + arrayList);

        arrayList.remove("Item1");
        System.out.println("List after removing 'Item1': " + arrayList);

        boolean containsItem3 = arrayList.contains("Item3");
        System.out.println("Does the list contain 'Item3'? " + containsItem3);

        Collections.sort(arrayList);
        System.out.println("Sorted list: " + arrayList);

        Collections.reverse(arrayList);
        System.out.println("Reversed list: " + arrayList);

        List<String> subList = arrayList.subList(1, 3);
        System.out.println("Sublist from index 1 to 3: " + subList);

        arrayList.clear();
        System.out.println("List after clearing: " + arrayList);
    }
}