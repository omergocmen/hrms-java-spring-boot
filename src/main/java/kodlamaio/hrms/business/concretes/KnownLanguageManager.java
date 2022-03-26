package kodlamaio.hrms.business.concretes;


import kodlamaio.hrms.business.abstracts.KnownLanguageService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.KnownLanguageDao;
import kodlamaio.hrms.entities.concretes.KnownLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnownLanguageManager implements KnownLanguageService {
    @Autowired
    private KnownLanguageDao knownLanguageDao;


    @Override
    public List<KnownLanguage> getAll() {
        return this.knownLanguageDao.findAll();
    }

    @Override
    public Result add(KnownLanguage knownLanguage) {
        this.knownLanguageDao.save(knownLanguage);
        return new SuccessResult("Başarıyla eklendi");
    }
}
