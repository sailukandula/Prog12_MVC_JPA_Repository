package com.iss.Prog12_MVC_JPA_Repository.controller;

import com.iss.Prog12_MVC_JPA_Repository.entities.EmployeeData;
import com.iss.Prog12_MVC_JPA_Repository.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @GetMapping("")
    public String index(){
        return "index";
    }
    @PostMapping("/new")
    public String newEmployee(EmployeeData employeeData,Model model){
      //  System.out.println(employeeData.getId() + employeeData.getName());
        employeeService.save(employeeData);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }

    @GetMapping("/employeeList")
    public String listEmployee(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id,Model model) {
        employeeService.deleteById(id);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable int id, Model model) {
        EmployeeData employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "editEmployee";  // create this page
    }
    @PostMapping("/update")
    public String updateEmployee(EmployeeData employeeData, Model model) {
        employeeService.save(employeeData); // save() performs UPDATE
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employeeList";
    }

}
