package sy.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sy.rest.dao.EmployeeRepository;
import sy.rest.model.Employee;


@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@RequestMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

}

