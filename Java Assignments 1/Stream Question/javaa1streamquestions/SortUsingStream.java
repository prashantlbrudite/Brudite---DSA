package StreamMethods;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SortUsingStream{
    public static void main(String[] args) {
        List<Integer> ls= Stream.of(12345,2343,563).sorted(Collections.reverseOrder()).sorted().collect(Collectors.toList());

        System.out.println(ls);
    }
}