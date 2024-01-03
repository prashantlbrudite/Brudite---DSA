package StreamMethods;

public class firstrepeatingChar {
    public static void main(String[] args) {
        String str = "loveleetcode";
        char ch = str.chars().mapToObj(c -> (char) c).filter(cha -> str.indexOf(cha) != str.lastIndexOf(cha)).findFirst().get();
        System.out.println(ch);
    }
}
