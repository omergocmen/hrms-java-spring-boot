package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.Query;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

    Employer findByEmail(String email);
    @Query("From Employer where id=:id")
    Employer getByEmployersIdList(int id);

    Employer findEmployerByCompanyName(String companyName);

}
