package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="known_languages")
public class KnownLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="known_language_id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="level")
    private String level;

    @ManyToOne
    @JoinColumn(name="cv_id")
    private CurriculumVitae curriculumVitae;

}
