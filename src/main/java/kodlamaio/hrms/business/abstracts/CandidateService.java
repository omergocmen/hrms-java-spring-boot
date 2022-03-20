package kodlamaio.hrms.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate>getAll();
	Result add(Candidate candidate) throws Exception;;
}
