package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAnnouncement;

import java.util.List;


public interface JobAnnouncementService {




    Result add (JobAnnouncement jobAnnouncement);

    Result delete(int announcementId);

    DataResult<List<JobAnnouncement>> getAll();

    DataResult<List<JobAnnouncement>> findAllByIsActiveTrue();

    DataResult<List<JobAnnouncement>> getByIsActiveTrueOrderByApplicationDeadlineDesc();

    DataResult<List<JobAnnouncement>> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName);

    DataResult<List<JobAnnouncement>>getByCityName(String cityName);
    DataResult<List<JobAnnouncement>>getByPositonName(String positionName);

    Result changeToUnActive(int id);


}