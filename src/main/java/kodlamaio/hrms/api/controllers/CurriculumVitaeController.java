package kodlamaio.hrms.api.controllers;
import kodlamaio.hrms.business.abstracts.CurriculumVitaeService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CurriculumVitaeController {

    @Autowired
    CurriculumVitaeService curriculumVitaeService;

    @GetMapping("/getAll")
    public List<CurriculumVitae>getAll(){
       return this.curriculumVitaeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CurriculumVitae curriculumVitae)
    {
        return this.curriculumVitaeService.add(curriculumVitae);
    }
}
