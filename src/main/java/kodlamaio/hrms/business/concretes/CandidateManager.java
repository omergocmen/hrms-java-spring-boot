package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapters.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

		if(!this.isEmailExist(candidate.getEmail()).isSuccess() || !this.isIdentityExist(candidate.getIdentityNumber()).isSuccess()){
			return new ErrorResult("Email adresi ve/veya kimlik numarası kullanımda");
		}

		Result checkCandidate=mernisCheckService.checkIfRealPerson(candidate);
		if(!checkCandidate.isSuccess()) {
			return new ErrorResult("Kullanıcı bulanamadı");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<Candidate> getByEmail(String email) {
		return new SuccessDataResult<Candidate>(this.candidateDao.findByEmail(email),"Data listelendi");
	}
	@Override
	public DataResult<Candidate> getByIdentityNumber(String identity) {
		return new SuccessDataResult<Candidate>(this.candidateDao.getByIdentityNumber(identity),"Data listelendi");
	}


	private Result isIdentityExist(String identity) {
		if(this.candidateDao.getByIdentityNumber(identity)!= null) {
			return new ErrorResult("Kimlik numarası kullanımda");
		}
		return new SuccessResult("Kimlik numarası kullanılabilir");
	}

	private Result isEmailExist(String email) {
		if(this.candidateDao.findByEmail(email)!= null) {
			return new ErrorResult("Email kullanımda");
		}
		return new SuccessResult("Email kullanılabilir");
	}

}
