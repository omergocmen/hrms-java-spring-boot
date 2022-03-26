package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="social_address")
public class SocialAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="github_address")
    private String githubAddress;

    @Column(name="linkedln_address")
    private String linkedln;

    @Column(name="web_address")
    private String webAddress;

    @Column(name="phone_number")
    private String phoneNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    @JoinColumn(name ="cv_id")
    private CurriculumVitae curriculumVitae;

}
