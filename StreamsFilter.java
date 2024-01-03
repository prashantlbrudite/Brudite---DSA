
import java.util.*;
import java.util.stream.Collectors;  
public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        List<Integer> numbers = Arrays.asList(10,15,20,25);
        List<Integer> evenNumbers = new ArrayList<>();
        // without using Streams;
        // for(int i : numbers){
        //     if(i % 2 == 0)
        //         evenNumbers.add(i);
        // }
        // System.out.println(evenNumbers);
        // System.out.println(numbers);
        
        // With Streams
        
        // evenNumbers = numbers.stream().filter( n -> n %2 == 0).collect(Collectors.toList());
        // System.out.println(evenNumbers);
        
        // numbers.stream().filter( n -> n % 2 == 0).forEach(n -> System.out.println(n)); // storing it nowhere and just printing the  data.
        
    //    another method using the println method 
        // numbers.stream().filter(n -> n %  2 == 0).forEach(System.out::println);
        
        // List<String> names = Arrays.asList("Prashant", "lalwani", "Suresh" , "Lalwani");
        // List<String> longNames = new ArrayList<>();
        
        // when we have to give more than one conditions inside the filter method.
        
        // longNames = names.stream().filter(str -> str.length() > 7 && str.length() < 10).collect(Collectors.toList());
        // System.out.println(longNames);
        
        List<String> containNulls = Arrays.asList("Prashant", null, "lalwani", "Suresh" , null , "Lalwani");
        List<String> notNulls = new ArrayList<>();
        notNulls = containNulls.stream().filter( w -> w != null).collect(Collectors.toList());
        System.out.println(notNulls);

         
        
    }
}
 