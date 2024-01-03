
import java.util.*;
import java.util.function.DoubleToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private String department;
    private String gender;
    private int age;
    private double salary;
    private long experience;

    public Employee(int id, String name, String department, String gender, int age, double salary, long experience){
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDept(){
        return this.department;
    }

    public String getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }

    public long getExp(){
        return this.experience;
    }

    @Override
    public String toString(){
            return "id :" + id + ", name: " + name + ", deparment: " + department;
    }

}

class EmployeeOps{
    public static void main(String[] args) {
        List<Employee> allEmp = Arrays.asList(
            new Employee(1, "Prashant Lalwani", "IT", "Male", 20, 200000, 1),
            new Employee(2, "Megha Sharma", "IT", "Female", 20, 200001, 0),
            new Employee(3, "Manish Gomdani", "Mechenical", "Male", 19, 100000, 1),
            new Employee(4, "Kapil Gomdani", "Electronic", "Male", 16, 250000, 4)
        );
        
        // method to get the number of Male and Female.
        Map<String,List<String>> mp = allEmp.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(mp);

        // Method to print the name of all department

        Set<String> st = allEmp.stream().map( Employee::getDept).collect(Collectors.toSet());

        System.out.println(st);



        // INformation of highest paid employee in the organization.

        TreeMap<Double,List<Employee>> mp2 = allEmp.stream().collect(Collectors.groupingBy(Employee::getSalary, TreeMap::new, Collectors.toList()));

        System.out.println(mp2);
        
        Double highestSalary = mp2.lastKey();


        List<Employee> highestPaidEmployees = mp2.get(highestSalary);

        System.out.println("Highest Paid Salary: " + highestSalary);
        System.out.println("Highest Paid Employees: " + highestPaidEmployees);

        // Number of employee in each department

        Map<String,Long> mpp = allEmp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        System.out.println(mpp);

        // Average Salary of each department.

        Map<String,List<Double>> mpa = allEmp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getSalary, Collectors.toList())));

        for(String it : mpa.keySet()){
            Double deptAvg = mpa.get(it).stream().reduce(0.0, (x,y) -> x+y)/ mpa.get(it).size();
            System.out.println("Department: "+ it +" Avg Salary: " + deptAvg );
        }


        // Employee with the most experience
        Comparator<Employee> compare = Comparator.comparing(Employee::getExp);
        String oldest = allEmp.stream().sorted(Collections.reverseOrder(compare)).findFirst().get().getName();

        System.out.println(oldest);

        // Employee with the youngest age
        Comparator<Employee> young = Comparator.comparing(Employee::getAge);
        String youngest = allEmp.stream().sorted(young).findFirst().get().getName();
        System.out.println(youngest);

         // Method to get the average and total salary of the whole organization.

        DoubleSummaryStatistics males = allEmp.stream().filter(e -> e.getGender() == "Male").collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(males.getAverage());
        System.out.println(males.getSum());

        DoubleSummaryStatistics females = allEmp.stream().filter(e -> e.getGender() == "Female").collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println(females.getAverage());
        System.out.println(females.getSum());

        // Average age of male and female employee;

        Long avgMaleAge = allEmp.stream().filter(e -> e.getGender() == "Male").map(Employee::getAge).reduce(0, (x,y) -> x+y) / males.getCount();

        System.out.println(avgMaleAge);

        Long avgfeMaleAge = allEmp.stream().filter(e -> e.getGender() == "Female").map(Employee::getAge).reduce(0, (x,y) -> x+y) / females.getCount();

        System.out.println(avgfeMaleAge);

    }
}