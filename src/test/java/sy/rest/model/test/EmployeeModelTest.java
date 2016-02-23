package sy.rest.model.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	EmployeeRepository emRepository;
	
	@Before
	public void setUp() {
	}

	@Test
	public void find() throws Exception {
		System.out.println("find");
		Iterable<Employee> emList = emRepository.findAll();
		for(Employee val:emList){
			System.out.print(val.toString() + ",\n");
		}
	}

}
