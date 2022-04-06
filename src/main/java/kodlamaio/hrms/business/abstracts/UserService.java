package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
	List<User>getAll();
	DataResult<User>getByEmail(String Email);
}
