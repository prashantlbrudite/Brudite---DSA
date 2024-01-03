import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Item1");
        linkedList.add("Item2");
        linkedList.addAll(Set.of("Item3", "Item4", "Item5"));

        System.out.println("LinkedList: " + linkedList);

        linkedList.addFirst("FirstItem");
        linkedList.addLast("LastItem");
        System.out.println("LinkedList after adding first and last elements: " + linkedList);

        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        linkedList.remove("Item2");
        System.out.println("LinkedList after removing 'Item2': " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing first and last elements: " + linkedList);

        System.out.println("Size of the LinkedList: " + linkedList.size());
        System.out.println("Is the LinkedList empty? " + linkedList.isEmpty());

        System.out.println("Iterating through the LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
