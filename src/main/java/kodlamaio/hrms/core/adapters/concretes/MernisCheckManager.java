package kodlamaio.hrms.core.adapters.concretes;


import kodlamaio.hrms.mernis.HSEKPSPublicSoap12;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.core.adapters.abstracts.MernisCheckService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;




@Service
public class MernisCheckManager implements MernisCheckService{

	@Override
	public Result checkIfRealPerson(Candidate candidate) throws Exception {
		HSEKPSPublicSoap12 kpsPublicSoapProxy = new HSEKPSPublicSoap12();
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()),candidate.getFirstName(),candidate.getLastName(),candidate.getBirtOfYear());
		if(!result) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}

}
