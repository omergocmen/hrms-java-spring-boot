package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPositions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer> {

    JobPositions findByJobExplanation(String jobExplanation);
    JobPositions findJobPositionsById(int id);
    JobPositions findJobPositionsByJobExplanation(String jobExplanation);
}