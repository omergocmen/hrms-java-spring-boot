package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobexperience")
public class JobExperienceController {

    @Autowired
    private JobExperienceService jobExperienceService;

    @GetMapping("/getAll")
    public List<JobExperience>getAll(){
        return this.jobExperienceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobExperience jobExperience){
        return  this.jobExperienceService.add(jobExperience);
    }
}
