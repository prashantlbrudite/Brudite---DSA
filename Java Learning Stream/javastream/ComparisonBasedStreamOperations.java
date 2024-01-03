
// it includes the use of sorted, min , max, distinct, allMatch, anyMatch, and noneMatch

import java.util.*;
import java.util.stream.Collectors;

class Person{
    int age;
    String name;
    int status;
    public Person(int age, String name, int status){
        this.age = age;
        this.name = name;
        this.status = status;
    }
    public int getage(){
        return this.age;
    }
}

public class ComparisonBasedStreamOperations {
    public static void main(String[] args) {
        List<Person> goodPerson = Arrays.asList(new Person(40, "old", 40), new Person(30, "less old", 30),new Person(20, "young", 20));

        goodPerson.stream().sorted((e1,e2) -> e1.status - e2.status).forEach(x -> System.out.println(x.name));
        goodPerson.stream().sorted((e1,e2) -> e1.name.compareTo(e2.name)).forEach(x -> System.out.println(x.name));

        Optional<Person> youngest = goodPerson.stream().min((e1,e2) -> e1.age - e2.age);// min returns a optional object.
        Optional<Person> oldest = goodPerson.stream().max((e1,e2) -> e1.age - e2.age);// max returns a optional object.
        Optional<Person> anotherOldest = goodPerson.stream().max(Comparator.comparing(Person::getage));// max returns a optional object.

        System.out.println(youngest.get().age);
        System.out.println(oldest.get().age);
        System.out.println(anotherOldest.get().age);

        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3, 7, 8, 2);
        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctIntList);
    
        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
        System.out.println("All Even: " + allEven + ", One Even: " + oneEven + ", None Multiple of Three: " + noneMultipleOfThree);

    }
}
