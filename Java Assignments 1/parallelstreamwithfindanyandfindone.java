
// import java.*;
// import java.util.regex;
import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
        // List<String> vehicles = Arrays.asList("bus", "fastcar", "cycle", "tuktuk");
        List<String> elements = Stream.of("a", "bus", "c", "b").filter(element -> element.contains("b")).collect(Collectors.toList());
        Optional<String> anyElement = elements.parallelStream().findAny();
        Optional<String> firstElement = elements.parallelStream().findFirst();
        System.out.println(anyElement);
        System.out.println(firstElement);
        
        
  }
}
