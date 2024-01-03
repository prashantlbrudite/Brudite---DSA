package JavaStreamSpecialization;

// it includes the use of intStream, doubleStream, and LongStream for primitive int, long and double data type which reduces the load of boxing and unboxing when the data set is too large to process.



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
public class IntStream {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(new Employee(1, "Prashant Lalani", 202000.3), new Employee(2, "Suresh Lalwani", 400040.0), new Employee(3, "Rohan", 323232.2));

        Integer empid = allEmployees.stream().mapToInt(Employee::getId).max().getAsInt();
        Double empSalary = allEmployees.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        // Long empLong = allEmployees.stream().mapToLong(Employee::getId).max().getAsLong(); this would be valid if there was long method and  long value to get frome employee class.

        System.out.println("Max emp id is: " +  empid + " and Max empSalary is: " + empSalary);

    }
}
