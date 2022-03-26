package kodlamaio.hrms.dataAccess.abstracts;


import kodlamaio.hrms.entities.concretes.KnownLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnownLanguageDao extends JpaRepository<KnownLanguage,Integer> {
}
