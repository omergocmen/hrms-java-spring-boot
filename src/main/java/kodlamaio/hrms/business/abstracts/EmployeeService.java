package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee>getAll();
	Result add(Employee employee);
}
