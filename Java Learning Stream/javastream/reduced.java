import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }


    public String getName(){
        return this.name;
    }


    public double getSalary(){
        return this.salary;
    }
}

public class reduced {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(new Employee(1, "Prashant Lalani", 202000.3), new Employee(2, "Suresh Lalwani", 400040.0), new Employee(3, "Rohan", 323232.2));

        Double sum2 = allEmployees.stream().map(Employee::getSalary).reduce(0.0, (x,y) -> x+ y);
        System.out.println(sum2);
    }
}
