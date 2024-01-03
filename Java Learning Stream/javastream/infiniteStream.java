
import java.util.stream.Stream;
import java.lang.Math;

// it consist of iterate, generate and ofNullable.


public class infiniteStream {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1).limit(5).forEach(System.out::println);

        Stream.generate(Math::random).limit(5).forEach(x -> System.out.println(Math.ceil(x*10)));

        

        // this is just an example of ofNullable which prevent any runtime error if the given number is null from the frontend.

        Integer number = null;
        Stream<Integer> result = Stream.ofNullable(number);
        result.map(x -> x * x).forEach(System.out::println);
    }
}
