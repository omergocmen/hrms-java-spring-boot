package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SchoolIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolInDao extends JpaRepository<SchoolIn,Integer> {
}
