package sy.rest.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import sy.rest.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>  {
	public List<Employee> findByIdentityCard(String identityCard);
	public List<Employee> findByName(String name);
}
