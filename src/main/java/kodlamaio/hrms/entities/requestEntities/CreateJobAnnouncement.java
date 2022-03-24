package kodlamaio.hrms.entities.requestEntities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Null;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateJobAnnouncement {

    private int id;

    private String description;

    private int openPositions;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date applicationDeadline;

    @Null(message="Alan boş geçilemez")
    private LocalDateTime releaseDateTime = LocalDateTime.now();

    private boolean isActive;

    private int minSalary;

    private int maxSalary;

}
