package sky.pro.Empl.service;

import org.springframework.stereotype.Service;
import sky.pro.Empl.exeption.EmployeeAllReadyAddExeption;
import sky.pro.Empl.exeption.EmployeeNotFoundExeption;
import sky.pro.Empl.model.Employee;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Map<String,Employee> employees;

    public EmployeeServiceImpl(){
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if(employees.containsKey(employee.getFullName())){
            throw new EmployeeAllReadyAddExeption();
        }
        employees.put(employee.getFullName(),employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if (employees.containsKey(employee.getFullName())){
           return employees.remove(employee.getFullName());

        }
        throw new EmployeeNotFoundExeption();
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName,lastName);
        if(employees.containsKey(employee.getFullName())){
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundExeption();
    }

    @Override
    public Collection<Employee> findAll() {

        return Collections.unmodifiableCollection(employees.values());
    }
}
