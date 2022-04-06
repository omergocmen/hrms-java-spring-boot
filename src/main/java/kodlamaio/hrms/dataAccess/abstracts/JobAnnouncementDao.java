package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAnnouncement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAnnouncementDao extends JpaRepository<JobAnnouncement, Integer> {

    List<JobAnnouncement> findAllByIsActiveTrue();

    @Query("From JobAnnouncement where isActive=true Order By applicationDeadline Desc")
    List<JobAnnouncement> getByIsActiveTrueOrderByApplicationDeadlineDesc(Sort sort);

    List<JobAnnouncement> findAllByEmployer_CompanyNameAndIsActiveTrue(String companyName);

    JobAnnouncement findById(int id);

    List<JobAnnouncement>getByCities_CityName(String cityName);
    List<JobAnnouncement>getByJobPositions_JobExplanation(String cityName);


}