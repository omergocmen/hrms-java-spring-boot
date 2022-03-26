package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;

import java.util.List;

public interface CurriculumVitaeService {

    List<CurriculumVitae>getAll();
    Result add(CurriculumVitae curriculumVitae);

}
