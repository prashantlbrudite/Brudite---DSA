import java.util.*;
// import java.util.
import java.util.stream.*;
// it consist the use of map, flatmap, collect, filter, classFuntionality and etc...
class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class flatmap {

    public static void main(String[] args) {
        List<Employee> amazonEmployees = Arrays.asList(new Employee(1, "Prashant Lalwani", 21000.0),
                new Employee(2, "Jeff", 20000.0));
        List<Employee> googleEmployees = Arrays.asList(new Employee(1, "Prashant Sharma", 20010.0),
                new Employee(2, "Jeff google", 20000.0));
        List<List<Employee>> allEmployees = Arrays.asList(amazonEmployees,googleEmployees);

        List<String> goodEmployees = allEmployees.stream().flatMap(x -> x.stream().filter(emp -> emp.salary > 20000).map(x1 -> x1.name)).collect(Collectors.toList());

        System.out.println(goodEmployees);

    }
}
