package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.AbilityService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.AbilityDao;
import kodlamaio.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityManager implements AbilityService {

    @Autowired
    private AbilityDao abilityDao;

    @Override
    public Result add(Ability ability) {
        this.abilityDao.save(ability);
        return new SuccessResult("Başarıyla eklendi");
    }

    @Override
    public List<Ability> getAll() {
        return this.abilityDao.findAll();
    }
}
