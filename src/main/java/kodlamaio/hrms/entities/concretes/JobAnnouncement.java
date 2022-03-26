package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.Null;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name ="job_announcements")
public class JobAnnouncement {

    @Id
    @Column(name="job_announcement_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="description")
    private String description;

    @Column(name = "open_positions")
    private int openPositions;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "application_deadline")
    private Date applicationDeadline;

    @Null(message="Alan boş geçilemez")
    @Column(name="release_date_time")
    private LocalDateTime releaseDateTime = LocalDateTime.now();

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;


    @ManyToOne
    @JoinColumn(name="employer_id",referencedColumnName = "id")
    private Employer employer;

    @ManyToMany
    @JoinTable(name = "job_announcment_cities",
            joinColumns = {@JoinColumn(name = "job_announcement_id")},
            inverseJoinColumns = {@JoinColumn(name = "city_id")}
    )
    private List<City> cities;

    @ManyToMany
    @JoinTable(name = "job_announcment_positions",
            joinColumns = {@JoinColumn(name = "job_announcement_id")},
            inverseJoinColumns = {@JoinColumn(name = "positions_id",referencedColumnName = "id")}
    )
    private List<JobPositions> jobPositions;


}
