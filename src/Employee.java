import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String name;
    private final int id;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.name + ", отдел: " + this.department + ", зарплата: " + this.salary;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return name.equals(employee.name) && department == employee.department && salary == employee.salary && id == employee.id;
    }

    public int hashCode() {
        return Objects.hash(name, department, salary, id);
    }
}