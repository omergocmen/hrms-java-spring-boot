package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany(mappedBy = "curriculumVitae")
    private List<KnownLanguage> knownLanguages;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany(mappedBy = "curriculumVitae")
    private List<SchoolIn> schoolInformations;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany(mappedBy = "curriculumVitae")
    private List<JobExperience> jobExperiences;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany(mappedBy = "curriculumVitae")
    private List<Ability> abilities;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToOne(mappedBy = "curriculumVitae")
    private SocialAddress socialAddress;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    private Candidate candidate;



}
