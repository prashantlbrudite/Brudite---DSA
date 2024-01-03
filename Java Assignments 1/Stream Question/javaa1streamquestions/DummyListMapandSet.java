package StreamMethods;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DummyListMapandSet{
    public static void main(String[] args) {
        List<String> al = Arrays.asList("Prashant", "Lalwani", "Lalwani");

        List<Integer> newal = Stream.of(12,3,4,5,12,5).collect(Collectors.toList());


        Map<Object,
        Long> map2 = al.stream().collect(Collectors.groupingBy(e ->e , Collectors.mapping(e -> e.length(), Collectors.counting())));

        Set<Integer> st = newal.stream().collect(Collectors.toSet());
        System.out.println(st);

        System.out.println(map2);

    }
}