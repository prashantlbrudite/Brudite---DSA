package StreamMethods;

import java.util.*;
import java.util.stream.Collectors;

public class wordCount {
    public static void main(String[] args) {
         List<String> words = Arrays.asList("Prashant", "Lalwani", "Prashant");

        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println( wordCounts);
    }
}
