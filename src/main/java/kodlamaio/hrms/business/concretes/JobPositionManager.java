package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobPositionManager(JobPositionsDao jobPositionsDao) {
        super();
        this.jobPositionsDao = jobPositionsDao;
    }



    @Override
    public DataResult<List<JobPositions>> getAll() {

        return new SuccessDataResult(this.jobPositionsDao.findAll(),"Data listelendi");
    }



    @Override
    public Result add(JobPositions jobPositions) {
        if (this.jobPositionsDao.findByJobExplanation(jobPositions.getJobExplanation())!=null) {
            return new ErrorResult("Açıklama daha önce kullanıldı");
        }else {
            this.jobPositionsDao.save(jobPositions);
            return new SuccessResult("İş pozisyonu oluşturuldu");
        }

    }



}