import java.util.*;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Element1");
        stack.push("Element2");
        stack.addAll(Set.of("Element3", "Element4", "Element5"));

        System.out.println("Stack: " + stack);

        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);

        String peekedElement = stack.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Stack after peeking: " + stack);

        stack.remove("Element2");
        System.out.println("Stack after removing 'Element2': " + stack);

        System.out.println("Size of the Stack: " + stack.size());
        System.out.println("Is the Stack empty? " + stack.isEmpty());

        System.out.println("Search for 'Element4' in the Stack: " + stack.search("Element4"));

        System.out.println("Iterating through the Stack (bottom to top):");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
