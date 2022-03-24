package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAnnouncementList"})
public class Employer  extends User{
	

	@Column(name="compnay_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone_number")
	private String phoneNumber;

	@OneToMany(mappedBy = "employer")
	private List<JobAnnouncement> jobAnnouncementList;

}
