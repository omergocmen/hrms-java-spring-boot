package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import org.springframework.stereotype.Service;


@Service
public class EmailVerificationManager implements EmailVerificationService {
    @Override
    public Result verifyEmail(String email) {
        return new SuccessResult();
    }
}
