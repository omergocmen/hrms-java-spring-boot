package kodlamaio.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="job_positions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPositions  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="job_explanation",unique = true)
    private String jobExplanation;



}