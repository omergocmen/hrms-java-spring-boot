package kodlamaio.hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","curriculumVitae"})
public class JobExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="campany_name")
    private String companyName;

    @Column(name="department")
    private String department;

    @Column(name="begin_time")
    private String beginTime;

    @Column(name="end_time")
    private String endTime;


    @ManyToOne
    @JoinColumn(name="cv_id")
    private CurriculumVitae curriculumVitae;

}
