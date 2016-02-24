package sy.rest.model.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import sy.rest.Application;
import sy.rest.dao.EmployeeRepository;
import sy.rest.model.Employee;

/**
 * @author huxiyu
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class EmployeeModelTest {

//	@Autowired
//	WebApplicationContext context;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Before
	public void setUp() {
	}

	@Test
	public void find() throws Exception {
		System.out.println("find");
		Iterable<Employee> emList = employeeRepository.findAll();
		for(Employee val:emList){
			System.out.print(val.toString() + ",\n");
		}
	}

	@Test
	public void saveEmployee(){
		String str2 = "{\"address\":\"安徽省濉溪县孙町镇北葛村土桥庄16号\",\"employeeidCard\":\"5\"," +
				"\"entryDate\":\"2013-03-01\",\"gender\":\"m\",\"identityCard\":\"340621198310088132\"," +
				"\"name\":\"张若虚\",\"tel\":\"13175102649\"}";
		Employee employee = JSON.parseObject(str2,new TypeReference<Employee>(){});
		System.out.println(JSON.toJSONString(employee));
		
		employeeRepository.save(employee);
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("message", "Book created successfully");
		response.put("employee", employee);
		System.out.println(JSON.toJSONString(response));
	}

}
