package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.KnownLanguage;

import java.util.List;

public interface KnownLanguageService {
    List<KnownLanguage> getAll();
    Result add(KnownLanguage knownLanguage);
}
