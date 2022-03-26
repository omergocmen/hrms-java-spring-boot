package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="school_informations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","curriculumVitae"})
public class SchoolIn {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="schoolName")
    private String schoolName;

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
