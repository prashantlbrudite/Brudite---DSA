package JavaStreamSpecialization;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;




// it consist the use of sum, average and range of the methods which are specific to streamspecialization.


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

public class sumAverageRange {
    public static void main(String[] args) {
        List<Employee> allEmployees = Arrays.asList(new Employee(1, "Prashant Lalani", 202000.3), new Employee(2, "Suresh Lalwani", 400040.0), new Employee(3, "Rohan", 323232.2));
        Double avg = allEmployees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        Double sum = allEmployees.stream().mapToDouble(Employee::getSalary).sum();
        int tot = IntStream.range(10,20).sum();

        System.out.println("The sum of the employee's salary through range is: " + tot);
        System.out.println("The sum of the employees is: " + sum);
        System.out.println("The average of the employee's salary is: " + avg);




    }
}
