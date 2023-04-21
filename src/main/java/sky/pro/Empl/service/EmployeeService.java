package sky.pro.Empl.service;

import sky.pro.Empl.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName,String lastName);
    Employee remove(String firstName,String lastName);
    Employee find(String firstName,String lastName);
    Collection<Employee> findAll();
    Employee deparmentMinSalary( String firstName, String lastName, int department, int salary);





}
