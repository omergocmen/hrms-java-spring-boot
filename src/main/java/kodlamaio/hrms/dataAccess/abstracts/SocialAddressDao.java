package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SocialAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialAddressDao extends JpaRepository<SocialAddress,Integer> {
}
