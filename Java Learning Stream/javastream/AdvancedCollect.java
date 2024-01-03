import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;



// it consist of parallelStream, joining, toSet , tocollection, groupBy, DoubleSummarizingStatistics , partitionby, mapping, reducing and their combination.


class Guy {

    public String name;
    private int age;
    private double bankBalance;
    private long Iq;


    public Guy(String name, int a, double b, long c) {
        this.name = name;
        this.age = a;
        this.bankBalance = b;
        this.Iq = c;
    }

    public int getAge(){
        return this.age;
    }

    public double getBankBalance(){
        return this.bankBalance;
    }

    public long getIq() {
        return this.Iq;
    }
}


public class AdvancedCollect {
    public static void main(String[] args) {
        List<Guy> allGuys = Arrays.asList(new Guy("Prashant Lalwani", 20, 10000.0, 104), new Guy("Manish Gomdani", 19, 2500.0, 78), new Guy("Kapil Gomdani", 16, 9500.0, 101), new Guy("Prashant Lalwani2", 40, 10000.0, 10));

        String names = allGuys.stream().map(x -> x.name).collect(Collectors.joining(", ")).toString();
        System.out.println("Names are : " + names);


        Set<String> namesSet = allGuys.parallelStream().map(x -> x.name).sorted((e1,e2) -> e1.compareTo(e2)).collect(Collectors.toSet());
        System.out.println("Set of names are:" + namesSet);


        TreeSet<String> sortedSet = allGuys.parallelStream().map(x -> x.name).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Sorted names are: " + sortedSet);

        DoubleSummaryStatistics stats = allGuys.stream().collect(Collectors.summarizingDouble(Guy::getBankBalance));
        System.out.println(stats);
 
        DoubleSummaryStatistics statsNew = allGuys.stream().mapToDouble(Guy::getBankBalance).summaryStatistics();
        System.out.println(statsNew);

        Map<Boolean,List<Integer>> mp = allGuys.stream().map(Guy::getAge).collect(Collectors.partitioningBy(i -> i%2 == 0));
        System.out.println(mp.get(true));
        System.out.println(mp.get(false)); // going forward i will show you how can you get the names of the people instead of their ages which will requrie the concept of mapping funtion inside the partitionby method.

        // Map<Character,List<Guy>> mapNames = allGuys.stream().collect(Collectors.groupingBy(e -> new Character(e.name.charAt(0)))); // Character constructer has been depreciated so below written method is better in time and space complexity
        Map<Character, List<Guy>> mapNames = allGuys.stream().collect(Collectors.groupingBy(guy -> guy.name.charAt(0)));

        for(Character it: mapNames.keySet()){
            System.out.println(mapNames.get(it).get(0).name);
        }


        Map<Character, List<Long>> map = allGuys.stream().collect(Collectors.groupingBy(e -> e.name.charAt(0),
        Collectors.mapping(Guy::getIq, Collectors.toList())));

         for(Character it: map.keySet()){
            System.out.println(map.get(it).get(0));
        }

        // Here we are using a custom comparator for the Guy class which compares the objects of Guy class on the basis of their age
        Comparator<Guy> compare = Comparator.comparing(Guy::getIq);

        Map<Character, Optional<Guy>> anotherMap = allGuys.stream().collect(Collectors.groupingBy(e -> e.name.charAt(0), Collectors.reducing(BinaryOperator.minBy(compare))));

         for(Character it: anotherMap.keySet()){
            System.out.println(anotherMap.get(it).get().name);
        }

    }
}
