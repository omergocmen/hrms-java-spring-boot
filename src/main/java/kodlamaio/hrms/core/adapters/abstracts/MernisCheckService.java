package kodlamaio.hrms.core.adapters.abstracts;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface MernisCheckService {
	Result checkIfRealPerson(Candidate candidate) throws Exception;
}
