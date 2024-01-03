
// it consist use of forEach, findfirst, toArray, peek operations.
// this code also shows the difference between stream and parallel stream.
import java.util.*;
// import java.util.stream.*;

class Student {
    int id;
    String name;
    String stream;

    public Student(int id, String name, String stream) {
        this.id = id;
        this.name = name;
        this.stream = stream;
    }
}

public class StreamOperations {
    public static void main(String[] args) {
        List<Student> scienceStudents = Arrays.asList(new Student(1, "Prashant Lalwani", "Science"),
                new Student(2, "Rohan", "Science"), new Student(3, "Manish", "Science"));

        List<Student> commerceStudents = Arrays.asList(new Student(1, "Tushar", "Commerce"),
                new Student(2, "Aditya", "Commerce"), new Student(3, "Hellboy", "Commerce"));

        List<List<Student>> allStudents = Arrays.asList(scienceStudents, commerceStudents);

        String[] firstStudents = allStudents.stream()
                .flatMap(x -> x.stream().filter(stu -> stu.id == 1).map(nam -> nam.name)).toArray(String[]::new);

        // System.out.println(firstStudents.toString()); gives the location of the object
        // on which the string is stored.
        for (String s : firstStudents) {
            System.out.println(s);
        }

        Student guy = allStudents.stream()
                .flatMap(List::stream)
                .filter(student -> student.id == 1).peek(x -> System.out.println(x.name))
                .findFirst()
                .orElse(null);
        if (guy != null) {
            System.out.println(guy.name);
        } else {
            System.out.println("null");
        }

        scienceStudents.stream().forEach(x -> System.out.println(x.name));

        
        String name = allStudents.stream()
                .flatMap(x -> x.stream()).filter(y -> y.id == 1).map(z -> z.name).findAny()
                .orElse(null);
        System.out.println(name);

        name = allStudents.parallelStream()
                .flatMap(x -> x.stream()).filter(y -> y.id == 1).map(z -> z.name).findAny()
                .orElse(null);
        System.out.println(name);
    }

}
