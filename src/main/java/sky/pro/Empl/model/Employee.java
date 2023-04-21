package sky.pro.Empl.model;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    //
    private int deparment;
    private int salary;


    public String getFullName(){
        return firstName+ "" + lastName;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDeparment() {
        return deparment;
    }

    public void setDeparment(int deparment) {
        this.deparment = deparment;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return deparment == employee.deparment && salary == employee.salary && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, deparment, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deparment=" + deparment +
                ", salary=" + salary +
                '}';
    }
}
