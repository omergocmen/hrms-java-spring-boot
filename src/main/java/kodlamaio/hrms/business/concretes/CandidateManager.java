package kodlamaio.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapters.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService {
	
	private MernisCheckService mernisCheckService;
	CandidateDao candidateDao;

	@Autowired
	public CandidateManager(MernisCheckService mernisCheckService,CandidateDao candidateDao) {
		this.mernisCheckService=mernisCheckService;
		this.candidateDao=candidateDao;
	}

	@Override
	public List<Candidate> getAll() {
		return this.candidateDao.findAll();	
		}

	@Override
	public Result add(Candidate candidate) throws Exception{
		Result checkCandidate=mernisCheckService.checkIfRealPerson(candidate);
		if(!checkCandidate.isSuccess()) {
			return new ErrorResult("Kullanıcı bulanamadı");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Başarıyla Eklendi");
	}

	

}
