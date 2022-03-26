package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolInService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolInDao;
import kodlamaio.hrms.entities.concretes.SchoolIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolInManager implements SchoolInService {
    @Autowired
    private SchoolInDao schoolInDao;

    @Override
    public List<SchoolIn> getAll() {
        return this.schoolInDao.findAll();
    }

    @Override
    public Result add(SchoolIn schoolIn) {
        this.schoolInDao.save(schoolIn);
        return new SuccessResult("Başarıyla eklendi");
    }

}
