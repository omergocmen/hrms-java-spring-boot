package kodlamaio.hrms.api.controllers;
import kodlamaio.hrms.business.abstracts.JobAnnouncementService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAnnouncement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job_announcements")
@CrossOrigin
public class JobAnnouncementController {

    @Autowired
    private JobAnnouncementService jobAnnouncementService;

    @GetMapping("/getAll")
    public DataResult<List<JobAnnouncement>> getAll(){
        return this.jobAnnouncementService.getAll();
    }


    @GetMapping("/getAllActiveJob")
    public DataResult<List<JobAnnouncement>> findAllByIsActiveTrue(){
        return this.jobAnnouncementService.findAllByIsActiveTrue();
    }

    @GetMapping("/getAllActiveDeadlineDesc")
    public DataResult<List<JobAnnouncement>> getByIsActiveTrueOrderByApplicationDeadlineDesc(){
        return this.jobAnnouncementService.getByIsActiveTrueOrderByApplicationDeadlineDesc();
    }

    @GetMapping("/getAllActiveCompanyNames")
    public DataResult<List<JobAnnouncement>> findAllByEmployer_CompanyNameAndIsActiveTrue(@RequestParam String companyName) {
        return this.jobAnnouncementService.findAllByEmployer_CompanyNameAndIsActiveTrue(companyName);
    }

    @PostMapping("/changeToUnActive")
    public Result changeToUnActive( int id) {
        return this.jobAnnouncementService.changeToUnActive(id);
    }

    @PostMapping("/add")
    public Result changeToUnActive(@RequestBody JobAnnouncement jobAnnouncement) {
        return this.jobAnnouncementService.add(jobAnnouncement);
    }

    @PostMapping("/getByCityName")
    public DataResult<List<JobAnnouncement>> getByCityName(@RequestParam String cityName) {
        return this.jobAnnouncementService.getByCityName(cityName);
    }

    @PostMapping("/getByPositionName")
    public DataResult<List<JobAnnouncement>> getByPositionName(@RequestParam String positionName) {
        return this.jobAnnouncementService.getByPositonName(positionName);
    }
}