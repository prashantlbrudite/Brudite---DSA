package StreamMethods;

import java.util.*;

public class firstnonRepeatingChar {
    public static void main(String[] args) {
        String str = "loveleetcode";

        char ch = str.chars().mapToObj( c -> (char)c ).filter(ca -> str.indexOf(ca) == str.lastIndexOf(ca)).findFirst().get();
        System.out.println(ch);

    }
}
