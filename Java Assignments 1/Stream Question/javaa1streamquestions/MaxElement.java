package StreamMethods;

import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,6,76,3);

        int num = al.stream().max(Integer::compareTo).get();
        System.out.println(num);
        
    }
}
