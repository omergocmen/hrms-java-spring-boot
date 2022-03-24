package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.HumanSourceApprovedService;
import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.stereotype.Service;


@Service
public class HumanSourceApprovedManager implements HumanSourceApprovedService {
    @Override
    public Result isApporevedFromHumanSource(Employer employer) {
        return new SuccessResult();
    }
}
