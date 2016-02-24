package sy.rest.model.test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import sy.rest.dao.EmployeeRepository;
import sy.rest.model.Employee;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class ModelTest {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Test
	public void jsonToEmployee(){
		String str1 = "[{\"address\":\"安徽省濉溪县孙町镇北葛村土桥庄16号\",\"employeeidCard\":\"5\"," +
				"\"entryDate\":\"2013-03-01\",\"gender\":\"m\",\"id\":2,\"identityCard\":\"340621198310088132\"," +
				"\"name\":\"张玉柱\",\"tel\":\"13175102649\",\"__id\":\"r1001\"," +
				"\"__previd\":-1,\"__index\":0,\"__status\":\"nochanged\",\"__nextid\":\"r1002\"}]";
		List<Employee> em = JSON.parseObject(str1,new TypeReference<List<Employee>>(){});
		System.out.println(JSON.toJSONString(em));
		
	}
}
