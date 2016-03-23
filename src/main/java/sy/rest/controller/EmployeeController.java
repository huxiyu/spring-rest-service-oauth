package sy.rest.controller;

import java.util.LinkedHashMap;
import java.util.List;
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
	public Map<String, Object> saveEmployee(@RequestBody String employeeJSON){
		// 返回值
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		// 解析json
		Employee employee = JSON.parseObject(employeeJSON,new TypeReference<Employee>(){});	

		// 查询身份证是否存在
		List<Employee> el1 = employeeRepository.findByIdentityCard(employee.getIdentityCard());
		if (0 == el1.size()) // 身份证不存在，可加入数据库
		{
			// 查询姓名是否存在
			List<Employee> el2 = employeeRepository.findByName(employee.getName());
			if (el2.size()>0) // 存在同姓名，姓名后加数字
			{
				System.out.println("存在同名:: "+employeeJSON);
				int randomNum = (int)(Math.random()*900)+100; 
				employee.setName(employee.getName() + randomNum);
			}
			// 设置employeeidCard为空，因为不能为Null
			employee.setEmployeeidCard("");
			// 存储employee
			employeeRepository.save(employee);
			response.put("message", "success");
			response.put("employee", JSON.toJSONString(employee));
		} else {
			System.out.println("身份证已经存在:: "+employeeJSON);
			response.put("message", "IdentityCard already exists");
			response.put("employee", JSON.toJSONString(employee));
		}
		
		return response;
	}

//	@RequestMapping(value="/get", method = RequestMethod.POST)
//	public Iterable<Employee> getEmployees() {
//		return employeeRepository.findAll();
//	}

}

