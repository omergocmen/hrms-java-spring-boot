package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

private EmployeeService employeeService;
	
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}

	@GetMapping("getall")
	public List<Employee> getll(){
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Employee employee) {
		return employeeService.add(employee);
	}
	

	
	
}
