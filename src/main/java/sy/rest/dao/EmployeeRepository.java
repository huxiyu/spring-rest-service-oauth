package sy.rest.dao;

import org.springframework.data.repository.CrudRepository;
import sy.rest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
//	public List<Employee> find();
}
