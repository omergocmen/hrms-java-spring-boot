package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.KnownLanguageService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.KnownLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/knownLanguage")
public class KnownLanguageController {

    @Autowired
    private KnownLanguageService knownLanguageService;

    @GetMapping("/getAll")
    public List<KnownLanguage>getAll(){
        return this.knownLanguageService.getAll();
    }

    @PostMapping("/add")
    Result add(@RequestBody KnownLanguage knowLanguage){
       return this.knownLanguageService.add(knowLanguage);
    }
}
