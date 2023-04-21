package sky.pro.Empl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.Empl.model.Employee;
import sky.pro.Empl.service.EmployeeService;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service){
        this.service = service;
    }
    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, String lastName){
        return service.add(firstName,lastName);
    }
    @GetMapping("/remove")
    public Employee removeEmploye(@RequestParam String firstName, String lastName) {
        return service.add(firstName, lastName);
    }
    @GetMapping("/find")
    public Employee findEmploye(@RequestParam String firstName, String lastName) {
        return service.find(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAll(){
        return service.findAll();
    }
}
