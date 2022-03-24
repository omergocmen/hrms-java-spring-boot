package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.core.utilities.Result;

public interface EmailVerificationService {
    public Result verifyEmail(String email);
}
