package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/getAll")
    public List<City>getAll(){
        return this.cityService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody City city){
        return this.cityService.add(city);
    }

}
