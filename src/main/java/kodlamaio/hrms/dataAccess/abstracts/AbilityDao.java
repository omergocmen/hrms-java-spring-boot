package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilityDao extends JpaRepository<Ability,Integer> {
}
