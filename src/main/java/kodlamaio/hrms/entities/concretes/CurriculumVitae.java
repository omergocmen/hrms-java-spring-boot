package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="curriculum_viates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidate","jobExperiences","knownLanguages","schoolInformations","abilities","socialAddress"})
public class CurriculumVitae {

    @Id
    @Column(name="cv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cvId;

    @Column(name="gender")
    private String gender;

    @Column(name="nationality")
    private String nationality;

    @Column(name="driver_license")
    private String driverLicense;

    @Column(name="description")
    private String description;

    @Column(name="profil_image")
    private String profilImage;



    @OneToMany(mappedBy = "curriculumVitae")
    private List<KnownLanguage> knownLanguages;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<SchoolIn> schoolInformations;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<JobExperience> jobExperiences;

    @OneToMany(mappedBy = "curriculumVitae")
    private List<Ability> abilities;

    @OneToOne(mappedBy = "curriculumVitae")
    private Candidate candidate;

    @OneToOne(mappedBy = "curriculumVitae")
    private SocialAddress socialAddress;

}
