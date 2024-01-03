package StreamMethods;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountEachCharacter {
    public static void main(String[] args) {
        String str = "Hello World!";

        Map<Character, Long> charCounts = str.chars().mapToObj(c -> (char)c).filter( cc -> cc != ' ').collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCounts);
    }
}
