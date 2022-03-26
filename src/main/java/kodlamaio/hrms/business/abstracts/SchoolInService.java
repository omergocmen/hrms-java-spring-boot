package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SchoolIn;

import java.util.List;

public interface SchoolInService {
    List<SchoolIn>getAll();
    Result add(SchoolIn schoolIn);
}
