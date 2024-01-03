import java.util.*;
public class QueueExample {

    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<>();

        linkedListQueue.add("Task1");
        linkedListQueue.add("Task2");
        linkedListQueue.addAll(Set.of("Task3", "Task4"));

        System.out.println("Queue: " + linkedListQueue);

        String polledElement = linkedListQueue.poll();
        System.out.println("Polled element: " + polledElement);
        System.out.println("Queue after polling: " + linkedListQueue);

        String peekedElement = linkedListQueue.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Queue after peeking: " + linkedListQueue);

        linkedListQueue.remove("Task2");
        System.out.println("Queue after removing 'Task2': " + linkedListQueue);

        System.out.println("Size of the Queue: " + linkedListQueue.size());
        System.out.println("Is the Queue empty? " + linkedListQueue.isEmpty());

        System.out.println("Iterating through the Queue:");
        for (String task : linkedListQueue) {
            System.out.println(task);
        }

        linkedListQueue.clear();
        System.out.println("Queue after clearing: " + linkedListQueue);
    }
}
