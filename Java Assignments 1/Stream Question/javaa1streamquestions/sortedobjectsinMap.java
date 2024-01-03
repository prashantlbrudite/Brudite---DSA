package StreamMethods;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Man{
    int id;
    int age;
    String name;
    double bankBalance;

    public Man(int id, int age, String name, double bankBalance){
        this.id = id;
        this.age = age;
        this.name = name;
        this.bankBalance = bankBalance;
    }

    
}
public class sortedobjectsinMap {
    public static void main(String[] args) {
        List<Man> allMen = Arrays.asList(new Man(1, 29, "Prashant", 123456), new Man(2, 39, "Noname", 2321), new Man(1, 234, "copy", 1234521));

        TreeMap<Integer,List<String>> mp =  allMen.stream().collect(Collectors.groupingBy(e -> e.id, TreeMap::new ,Collectors.mapping(e -> e.name, Collectors.toList())));

        System.out.println(mp);
    }
}
