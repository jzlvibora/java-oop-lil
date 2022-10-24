public class Employee {
    String name;
    int age;
    double salary;
    static String location = "MANILA";

    void raiseSalary(){
        System.out.println("New salary: " + (this.salary+10000));
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
