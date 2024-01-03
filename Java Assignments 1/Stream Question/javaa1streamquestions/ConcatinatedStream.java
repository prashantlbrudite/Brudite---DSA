package StreamMethods;

import java.util.stream.Stream;

public class ConcatinatedStream {
    public static void main(String[] args) {
        Stream<Integer> st1 = Stream.of(1,2,4,54,6);
        Stream<Integer> st2 = Stream.of(1,2,4,54,6);
        Stream.concat(st1, st2).forEach(System.out::println);;
        
    }
}
