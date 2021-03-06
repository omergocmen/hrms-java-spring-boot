package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate>getAll();
	Result add(Candidate candidate) throws Exception;
	DataResult<Candidate>getByEmail(String email);
	DataResult<Candidate>getByIdentityNumber(String indetity);
}
