package StreamMethods;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class duplicateCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tree", "Tree", "Prashant");

        Map<String, Long> wordCounts = list.stream()
                .collect(Collectors.groupingBy(w -> w, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(wordCounts);
    }
}
