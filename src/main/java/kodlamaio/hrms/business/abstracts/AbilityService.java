package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Ability;

import java.util.List;

public interface AbilityService {
    Result add(Ability ability);
    List<Ability> getAll();
}
