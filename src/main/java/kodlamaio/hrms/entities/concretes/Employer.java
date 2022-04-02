package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAnnouncementList"})
public class Employer  extends User{
	

	@Column(name="compnay_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@OneToMany(mappedBy = "employer")
	private List<JobAnnouncement> jobAnnouncementList;

}
