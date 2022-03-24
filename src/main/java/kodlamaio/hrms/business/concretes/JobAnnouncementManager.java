package kodlamaio.hrms.business.concretes;
import kodlamaio.hrms.business.abstracts.JobAnnouncementService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.JobAnnouncementDao;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobAnnouncement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAnnouncementManager implements JobAnnouncementService {

    private JobAnnouncementDao jobAnnouncementDao;
    private CityDao cityDao;
    private EmployerDao employerDao;
    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobAnnouncementManager(JobAnnouncementDao jobAnnouncementDao, CityDao cityDao, EmployerDao employerDao,
                                  JobPositionsDao jobPositionsDao) {
        super();
        this.jobAnnouncementDao = jobAnnouncementDao;
        this.cityDao = cityDao;
        this.employerDao = employerDao;
        this.jobPositionsDao = jobPositionsDao;
    }


    @Override
    public Result add(JobAnnouncement jobAnnouncement) {
        this.jobAnnouncementDao.save(jobAnnouncement);
        return new SuccessResult("İş ilanı eklendi");
    }

    @Override
    public Result delete(int announcementId) {
        this.jobAnnouncementDao.deleteById(announcementId);
        return new SuccessResult("İş ilanı silindi");
    }

    @Override
    public DataResult<List<JobAnnouncement>> getAll() {

        return new SuccessDataResult<List<JobAnnouncement>>(this.jobAnnouncementDao.findAll(),"Data listelendi");
    }

    @Override
    public DataResult<List<JobAnnouncement>> findAllByIsActiveTrue() {

        return new SuccessDataResult<>(this.jobAnnouncementDao.findAllByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAnnouncement>> getByIsActiveTrueOrderByApplicationDeadlineDesc() {
        Sort sort = Sort.by(Sort.Direction.DESC,"applicationDeadline");

        return new SuccessDataResult<List<JobAnnouncement>>
                (this.jobAnnouncementDao.getByIsActiveTrueOrderByApplicationDeadlineDesc(sort));
    }

    @Override
    public DataResult<List<JobAnnouncement>> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName) {

        return new SuccessDataResult<List<JobAnnouncement>>(this.jobAnnouncementDao.findAllByEmployer_CompanyNameAndIsActiveTrue(companyName),"Aktif şirketler listelendi");
    }

    @Override
    public DataResult<List<JobAnnouncement>> getByCityName(String cityName) {
        return new SuccessDataResult<List<JobAnnouncement>>(this.jobAnnouncementDao.getByCities_CityName(cityName),"Data listelendi");
    }

    @Override
    public DataResult<List<JobAnnouncement>> getByPositonName(String positionName) {
        return new SuccessDataResult<List<JobAnnouncement>>(this.jobAnnouncementDao.getByJobPositions_JobExplanation(positionName),"Data listelendi");
    }


    public DataResult<JobAnnouncement> getById(int id){
        return new SuccessDataResult(this.jobAnnouncementDao.getById(id));
    }

    public Result changeToUnActive(int id) {
        if(getById(id)== null) {
            return new ErrorResult("İş ilanı bulunamadı ");
        }
        if (getById(id).getData().isActive()==false) {
            return new SuccessResult("İş ilanı zaten kapalı");
        }
        JobAnnouncement jobAnnouncement=getById(id).getData();
        jobAnnouncement.setActive(false);
        this.jobAnnouncementDao.save(jobAnnouncement);
        return new SuccessResult("İş ilanı kapatıldı");
    }

}