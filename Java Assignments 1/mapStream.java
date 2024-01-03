
// import java.*;
// import java.util.regex;
import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "fastcar", "cycle", "tuktuk");
        // vehicles.stream().map( x -> x.toUpperCase()).forEach(System.out::println); 
        vehicles.stream().map( x -> x.length()).forEach(System.out::println);
        List<Integer> vehiclesNumbers = vehicles.parallelStream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println(vehiclesNumbers);
        
        System.out.println(vehicles); // no changes inside the main array of strings.
        
  }
}
