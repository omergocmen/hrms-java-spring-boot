package kodlamaio.hrms.mappers.concretes;

import kodlamaio.hrms.entities.concretes.JobAnnouncement;
import kodlamaio.hrms.entities.requestEntities.CreateJobAnnouncement;
import kodlamaio.hrms.mappers.abstracts.JobAnnouncementMapperService;
import org.springframework.stereotype.Service;

@Service
public class JobAnnouncementMapperManager implements JobAnnouncementMapperService {

   /* @Override
    public JobAnnouncement forRequest(CreateJobAnnouncement createJobAnnouncement) {
        JobAnnouncement jobAnnouncement=new JobAnnouncement();
        jobAnnouncement.setDescription(createJobAnnouncement.description);
        jobAnnouncement.setOpenPositions(createJobAnnouncement.openPositions);
        jobAnnouncement.setApplicationDeadline(createJobAnnouncement.applicationDeadline);
        jobAnnouncement.setReleaseDateTime(LocalDateTime.now());
        jobAnnouncement.setActive(createJobAnnouncement.isActive);
        jobAnnouncement.setMinSalary(createJobAnnouncement.minSalary);
        jobAnnouncement.setMaxSalary(createJobAnnouncement.maxSalary);
        return null;
    }*/
}
