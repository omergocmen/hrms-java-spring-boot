package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.SchoolInService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.SchoolIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolInController {

    @Autowired
    private SchoolInService schoolInService;

    @GetMapping("/getAll")
    public List<SchoolIn> getAll(){
        return this.schoolInService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SchoolIn schoolIn){
        return this.schoolInService.add(schoolIn);
    }

}
