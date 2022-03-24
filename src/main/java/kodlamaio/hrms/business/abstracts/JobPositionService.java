package kodlamaio.hrms.business.abstracts;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobPositions;

import java.util.List;

public interface JobPositionService {

    DataResult<List<JobPositions>> getAll();
    Result add(JobPositions jobPositions);


}