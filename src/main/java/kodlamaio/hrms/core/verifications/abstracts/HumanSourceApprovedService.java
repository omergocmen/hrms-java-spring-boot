package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface HumanSourceApprovedService {
    public Result isApporevedFromHumanSource(Employer employer);
}
