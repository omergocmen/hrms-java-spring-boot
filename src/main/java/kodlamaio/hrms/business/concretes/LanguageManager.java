package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LanguageManager implements LanguageService {

    @Autowired
    private LanguageDao languageDao;

    @Override
    public List<Language> getAll() {
        return this.languageDao.findAll();
    }

    @Override
    public Result add(Language language) {
         this.languageDao.save(language);
        return new SuccessResult("Başarıyla eklendi");
    }
}
