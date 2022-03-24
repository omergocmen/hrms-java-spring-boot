/*package kodlamaio.hrms.entities.dtos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Null;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAnnouncementDto {

    private int id;
    private int cityId;
    private int employerId;
    private int jobPositionId;
    private String jobExplanation;
    private String description;
    private String cityName;
    private int minSalary;
    private int maxSalary;
    private String companyName;
    private Date applicationDeadline;
    private int openPositions;
    private boolean isActive;

    @Null(message = "must be null")
    private LocalDateTime releaseDateTime = LocalDateTime.now();

}
*/