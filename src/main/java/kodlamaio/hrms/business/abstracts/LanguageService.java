package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();

    Result add(Language language);

}
