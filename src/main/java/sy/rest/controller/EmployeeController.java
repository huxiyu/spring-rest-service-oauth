package sy.rest.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import sy.rest.dao.EmployeeRepository;
import sy.rest.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeController(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createBook(@RequestBody String employeeJSON){
		Employee employee = JSON.parseObject(employeeJSON,new TypeReference<Employee>(){});	
		employeeRepository.save(employee);
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("message", "success");
		response.put("employee", JSON.toJSONString(employee));
		return response;
	}

//	@RequestMapping(value="/get", method = RequestMethod.POST)
//	public Iterable<Employee> getEmployees() {
//		return employeeRepository.findAll();
//	}

}

